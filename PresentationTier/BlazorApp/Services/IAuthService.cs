﻿using System.Security.Claims;
using Shared.DTOs;
using Shared.Models;

namespace BlazorApp.Services;

public interface IAuthService
{
    public Task LoginAsync(string username, string password);
    public Task LogoutAsync();
    public Task RegisterAsync(UserCreationDTO user);
    public Task<ClaimsPrincipal> GetAuthAsync();
    Task EditProfileData(UserInfoCreationDTO dto);
    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
    
    public Task AddCreditsAsync(int credits, string username);
    
}