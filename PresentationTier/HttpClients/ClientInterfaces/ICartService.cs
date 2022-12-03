using Shared.DTOs;

namespace HttpClients.ClientInterfaces;

public interface ICartService
{
    public Task AddToCartAsync(CartItemCreationDTO dto);
}