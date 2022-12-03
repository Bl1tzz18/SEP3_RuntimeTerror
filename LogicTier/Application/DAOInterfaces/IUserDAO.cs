using Shared.Models;

namespace Application.DAOInterfaces;

public interface IUserDAO
{
    Task<User> CreateUserAsync(User user);
    
    Task<User> LoginUserAsync(User user);

    Task<User> FindUserAsync(string userName);

    Task AddCreditsAsync(int credits, string username);

    Task RemoveCreditsAsync(int credits, string username);


}