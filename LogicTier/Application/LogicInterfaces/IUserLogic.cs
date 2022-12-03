using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
     Task<User> CreateUserAsync(UserCreationDTO userCreationDto);

     Task<User> LoginUserAsync(UserLoginDTO userLoginDto);
     
     Task AddCreditsAsync(int credits, string username);

     Task RemoveCreditsAsync(int credits, string username);
}