using System.Security.Claims;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task<User> CreateAsync(UserCreationDTO dto);

    Task<User> LoginAsync(UserLoginDTO dto);
    // public Task LoginAsync(string username, string password);
    public Task LogoutAsync();
    //
    // public Task<ClaimsPrincipal> GetAuthAsync();
    // public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}