using Application.DAOInterfaces;

namespace GrpcClient.DAO;

public class OrderDao : IOrderDAO
{
    private OrderService.OrderServiceClient orderService;

    public OrderDao(OrderService.OrderServiceClient orderService)
    {
        this.orderService = orderService;
    }

    public async Task RegisterOrderAsync(Shared.Models.Order order)
    {
        var registerOrder = new Order
        {
            Id = order.Id,
            User = ConvertSharedUserToGrpcUser(order.User),
            Total = order.Total
        };

        await orderService.RegisterOrderAsync(registerOrder);
    }

    public async Task RegisterOrderItemsAsync(List<Shared.Models.OrderItem> orderItems)
    {
        List<OrderItem> orderItemsProto = new List<OrderItem>();

        foreach (var orderItem in orderItems)
        {
            var orderItemProto = new OrderItem
            {
                Id = orderItem.Id,
                Order = ConvertSharedOrderToGrpcOrder(orderItem.Order),
                Product = ConvertSharedProductToGrpcProduct(orderItem.Product)
            };
            orderItemsProto.Add(orderItemProto);
        }

        OrderItems orderItemsProtoToSend = new OrderItems
        {
            OrderItems_ = { orderItemsProto }
        };

        await orderService.RegisterOrderItemAsync(orderItemsProtoToSend);
    }

    public async Task<Shared.Models.Order> FindOrderAsync(string username)
    {
        SearchField sf = new SearchField
        {
            Search = username
        };

        Order order = await orderService.FindOrderAsync(sf);

        Shared.Models.Order orderToFind = new Shared.Models.Order
        {
            Id = order.Id,
            User = ConvertGrpcUserToSharedUser(order.User),
            Total = order.Total
        };

        return orderToFind;
    }

    private Product ConvertSharedProductToGrpcProduct(Shared.Models.Product product)
    {
        return new Product
        {
            Id = product.Id,
            Name = product.Name,
            ImgPath = product.ImagePath,
            Price = product.Price,
            Description = product.Description,
            InStock = product.inStock,
            Category = ConvertSharedCategoryToGrpcCategory(product.Category)
        };
    }
    
    private Category ConvertSharedCategoryToGrpcCategory(Shared.Models.Category category)
    {
        return new Category
        {
            CategoryName = category.Name
        };
    }

    private Order ConvertSharedOrderToGrpcOrder(Shared.Models.Order order)
    {
        return new Order
        {
            Id = order.Id,
            User = ConvertSharedUserToGrpcUser(order.User),
            Total = order.Total
        };
    }
    
    private Shared.Models.User ConvertGrpcUserToSharedUser(User grpcUser)
    {
        var sharedUser = new Shared.Models.User
        {
            userName = grpcUser.Username,
            password = grpcUser.Password,
            FirstName = grpcUser.FName,
            LastName = grpcUser.LName,
            Credits = grpcUser.Credits,
            type = grpcUser.Type,
            phone = grpcUser.Phone,
            Address = ConvertGrpcAddressToSharedAddress(grpcUser.Address)
        };
        
        return sharedUser;
    }
    
    private Shared.Models.Address ConvertGrpcAddressToSharedAddress(Address address)
    {
        return new Shared.Models.Address
        {
            Country = address.Country,
            City = address.City,
            Zip = address.Zip,
            Street = address.Street
        };
    }
    
    private User ConvertSharedUserToGrpcUser(Shared.Models.User user)
    {
        return new User
        {
            Username = user.userName,
            Password = user.password,
            FName = user.FirstName,
            LName = user.LastName,
            Credits = user.Credits,
            Type = user.type,
            Phone = user.phone,
            Address = ConvertSharedAddressToGrpcAddress(user.Address)
        };
    }
    
    private Address ConvertSharedAddressToGrpcAddress(Shared.Models.Address address)
    {
        return new Address
        {
            Country = address.Country,
            City = address.City,
            Zip = address.Zip,
            Street = address.Street
        };
    }
}