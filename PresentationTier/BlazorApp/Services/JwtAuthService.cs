﻿using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Shared.DTOs;
using Shared.Models;

namespace BlazorApp.Services;

public class JwtAuthService : IAuthService
{
    private readonly HttpClient client = new ();
    
    // this private variable for simple caching
    public static string? Jwt { get; private set; } = "";
    
    public async Task LoginAsync(string username, string password)
    {
        UserLoginDTO userLoginDto = new()
        {
            Username = username,
            Password = password
        };
        
        string userAsJson = JsonSerializer.Serialize(userLoginDto);
        StringContent content = new(userAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage response = await client.PostAsync("https://localhost:7129/User/login", content);
        string responseContent = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(responseContent);
        }
        
        string token = responseContent;
        Jwt = token;

        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
    }

    public Task LogoutAsync()
    {
        Jwt = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        return Task.CompletedTask;
    }

    public async Task RegisterAsync(UserCreationDTO user)
    {
        String userAsJson = JsonSerializer.Serialize(user);
        StringContent content = new StringContent(userAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage response = await client.PostAsync("https://localhost:7129/User/register", content);
        String responseContent = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            Console.WriteLine(responseContent);
            throw new Exception(responseContent);
        }
    }
    

    public Task<ClaimsPrincipal> GetAuthAsync()
    {
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return Task.FromResult(principal);
    }

    public async Task EditProfileData(UserInfoCreationDTO dto)
    {
        String userAsJson = JsonSerializer.Serialize(dto);
        StringContent content = new StringContent(userAsJson, Encoding.UTF8, "application/json");

        HttpResponseMessage responseMessage =
            await client.PutAsync("https://localhost:7129/User/changeUserInfo", content);
        
        String responseContent = await responseMessage.Content.ReadAsStringAsync();
        
        if (!responseMessage.IsSuccessStatusCode)
        {
            Console.WriteLine(responseContent);
            throw new Exception(responseContent);
        }
    }
    
    public async Task AddCreditsAsync(int credits, string username)
    {
        StringContent content = new StringContent("", Encoding.UTF8, "application/json");
        
        HttpResponseMessage response = await client.PutAsync($"https://localhost:7129/User/addcredits?credits={credits}&username={username}",content);
        
        String responseContent = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            Console.WriteLine(responseContent);
            throw new Exception(responseContent);
        }
    }
    

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; } = null!;
    


    // JWT - Auth - Required methods
    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }
    
    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (string.IsNullOrEmpty(Jwt))
        {
            return new ClaimsPrincipal();
        }

        IEnumerable<Claim> claims = ParseClaimsFromJwt(Jwt);
    
        ClaimsIdentity identity = new(claims, "jwt");

        ClaimsPrincipal principal = new(identity);
        return principal;
    }
}