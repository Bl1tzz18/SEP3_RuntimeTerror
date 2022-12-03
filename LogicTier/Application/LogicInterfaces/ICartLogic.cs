using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface ICartLogic
{
    /*public Task RegisterCartAsync(CartCreationDTO dto);*/
    
    public Task RegisterCartItemAsync(CartItemCreationDTO dto);

    public Task<Cart> FindCartAsync(string username);

    public Task<ICollection<CartItem>> GetAllFromCartAsync(string username);

    public Task DeleteAllFromCartAsync(string username);

    public Task DeleteFromCartAsync(CartItemCreationDTO cartItem);
}