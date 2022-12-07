using Shared.Models;

namespace Application.DAOInterfaces;

public interface IOrderDAO
{
    Task RegisterOrderAsync(Order order);

    Task RegisterOrderItemsAsync(List<OrderItem> orderItems);

    Task<Order> FindOrderAsync(string username);
}