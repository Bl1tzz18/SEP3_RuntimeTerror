using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IOrderService
{
    public Task RegisterOrderAsync(string username);

    public Task RegisterOrderItemAsync(string username);

    public Task<ICollection<Order>> GetOrdersByUserAsync(string username);
}