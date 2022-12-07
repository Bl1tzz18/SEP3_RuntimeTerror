using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.Models;

namespace Application.Logic;

public class OrderLogic : IOrderLogic
{
    private readonly IOrderDAO orderDao;
    private readonly ICartDAO cartDao;
    private readonly IProductDAO productDao;
    private readonly IUserDAO userDao;

    public OrderLogic(IOrderDAO orderDao, ICartDAO cartDao, IProductDAO productDao, IUserDAO userDao)
    {
        this.orderDao = orderDao;
        this.cartDao = cartDao;
        this.productDao = productDao;
        this.userDao = userDao;
    }

    public async Task RegisterOrderAsync(string username)
    {
        Cart cart = await cartDao.FindCartAsync(username);

        User user = await userDao.FindUserAsync(cart.UserName);

        Order order = new Order
        {
            Id = cart.Id,
            User = user,
            Total = cart.Total
        };

        await orderDao.RegisterOrderAsync(order);
    }

    public async Task RegisterOrderItemsAsync(string username)
    {
        ICollection<CartItem> cartItems = await cartDao.GetAllFromCartAsync(username);

        Order order = await orderDao.FindOrderAsync(username);

        List<OrderItem> orderItems = new List<OrderItem>();

        foreach (var cartItem in cartItems)
        {
            Product product = await productDao.FindProductByIdAsync(cartItem.ProductId.ToString());
            OrderItem newOrderItem = new OrderItem
            {
                Id = cartItem.Id,
                Order = order,
                Product = product
            };
            orderItems.Add(newOrderItem);
        }

        await orderDao.RegisterOrderItemsAsync(orderItems);
    }
}