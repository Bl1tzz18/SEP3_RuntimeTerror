namespace Application.LogicInterfaces;

public interface IOrderLogic
{
    Task RegisterOrderAsync(string username);

    Task RegisterOrderItemsAsync(string username);
}