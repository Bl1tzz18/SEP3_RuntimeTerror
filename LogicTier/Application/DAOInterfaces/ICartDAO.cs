using Shared.DTOs;
using Shared.Models;

namespace Application.DAOInterfaces;

public interface ICartDAO
{
    public Task RegisterCartAsync(Cart cart);
    
    public Task RegisterCartItemAsync(CartItem cartItem);

    public Task<Cart> FindCartAsync(string username);

    public Task<ICollection<CartItem>> GetAllFromCartAsync(string username);

    public Task DeleteAllFromCartAsync(string username);

    public Task UpdateCartTotalAsync(string username);

    public Task DeleteFromCartAsync(CartItem cartItem);
}