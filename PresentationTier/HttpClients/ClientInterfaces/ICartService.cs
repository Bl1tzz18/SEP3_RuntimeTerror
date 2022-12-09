using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface ICartService
{
    public Task AddToCartAsync(CartItemCreationDTO dto);
    
    public Task RemoveItemFromCartAsync(string username, int productId);
    
    public Task RemoveItemsFromCartAsync(string username);

    public Task<Cart> FindCartAsync(string username);
}