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

        if (cart.Total>= user.Credits)
        {
            throw new Exception("Not enough credits");
        }
        
        Order order = new Order
        {
            Id = cart.Id,
            User = user,
            Total = cart.Total,
            status = "New"
        };

        await orderDao.RegisterOrderAsync(order);
    }

    public async Task RegisterOrderItemsAsync(string username)
    {
        ICollection<CartItem> cartItems = await cartDao.GetAllFromCartAsync(username);

        Order order = await orderDao.FindOrderAsync(username);
        
        if (order.status.Equals("New"))
        {
            List<OrderItem> orderItems = new List<OrderItem>();

            foreach (var cartItem in cartItems)
            {
                Product product = await productDao.FindProductByIdAsync(cartItem.ProductId.ToString());
                product.inStock = false;
            
                await productDao.UpdateProductAsync(product);
            
                OrderItem newOrderItem = new OrderItem
                {
                    Id = cartItem.Id,
                    Order = order,
                    Product = product
                };
                orderItems.Add(newOrderItem);
            }

            await userDao.RemoveCreditsAsync(order.Total, username);
                
            await orderDao.UpdateOrderStatus(username, "Completed");

            await orderDao.RegisterOrderItemsAsync(orderItems);

            await cartDao.DeleteAllFromCartAsync(username);
        }
        else
        {
            await orderDao.UpdateOrderStatus(username, "Failed");
            throw new Exception("Order canceled");
        }
        
    }
}