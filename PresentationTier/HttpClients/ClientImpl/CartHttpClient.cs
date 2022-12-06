﻿using System.Net.Http.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;

namespace HttpClients.ClientImpl;

public class CartHttpClient : ICartService
{

    private readonly HttpClient httpClient;

    public CartHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }


    public async Task AddToCartAsync(CartItemCreationDTO dto)
    {
        HttpResponseMessage response = await httpClient.PostAsJsonAsync("/Cart/cartitem", dto);

        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
    }
    
    public async Task RemoveItemFromCartAsync(string username, int productId)
    {
        HttpResponseMessage response = await httpClient.DeleteAsync($"/Cart/DeleteFromCartAsync?username={username}&productId={productId}");
        
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
    }

    public async Task RemoveItemsFromCartAsync(string username)
    {
        HttpResponseMessage response = await httpClient.DeleteAsync($"/Cart/DeleteAllFromCartAsync?username={username}");
        
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
    }
}