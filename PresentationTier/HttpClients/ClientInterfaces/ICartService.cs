using Shared.DTOs;

namespace HttpClients.ClientInterfaces;

public interface ICartService
{
    public Task AddToCartAsync(CartItemCreationDTO dto);
    
    public Task RemoveItemFromCartAsync(string username, int productId);
    
    public Task RemoveItemsFromCartAsync(string username);

    public Task FindCartAsync(string username);
}