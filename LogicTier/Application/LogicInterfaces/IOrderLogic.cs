using Shared.Models;

namespace Application.LogicInterfaces;

public interface IOrderLogic
{
    Task RegisterOrderAsync(string username);

    Task RegisterOrderItemsAsync(string username);
    
    Task<IEnumerable<Order>> GetOrdersByUsernameAsync(string username);
}