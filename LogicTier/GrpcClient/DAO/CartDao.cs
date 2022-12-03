using Application.DAOInterfaces;

namespace GrpcClient.DAO;

public class CartDao : ICartDAO
{
    private CartService.CartServiceClient cartService;

    public CartDao(CartService.CartServiceClient cartService)
    {
        this.cartService = cartService;
    }

    public async Task RegisterCartAsync(Shared.Models.Cart cart)
    {
        var registerCart = new Cart
        {
            Id = cart.Id,
            Username = cart.UserName,
            Total = cart.Total
        };

        await cartService.RegisterCartAsync(registerCart);
    }

    public async Task RegisterCartItemAsync(Shared.Models.CartItem cartItem)
    {
        /*Cart cart = ConvertSharedCartToGrpcCart(dto);*/

        var registerCartItem = new CartItem
        {
            CartId = cartItem.CartId,
            ProductId = cartItem.ProductId
        };

        await cartService.RegisterCartItemAsync(registerCartItem);
    }

    public async Task<Shared.Models.Cart> FindCartAsync(string username)
    {
        SearchField sf = new SearchField
        {
            Search = username
        };

        Cart cart = await cartService.FindCartAsync(sf);

        Shared.Models.Cart cartToFind = new Shared.Models.Cart
        {
            Id = cart.Id,
            UserName = cart.Username,
            Total = cart.Total
        };

        return cartToFind;
    }

    public async Task<ICollection<Shared.Models.CartItem>> GetAllFromCartAsync(string username)
    {
        var sf = new SearchField
        {
            Search = username
        };

        CartItems cartItems = await cartService.GetAllFromCartAsync(sf);

        ICollection<Shared.Models.CartItem> collection = new List<Shared.Models.CartItem>();

        foreach (var cartItem in cartItems.CartItems_)
        {
            if (cartItem == null)
                continue;

            Shared.Models.CartItem cart = new Shared.Models.CartItem
            {
                Id = cartItem.Id,
                CartId = cartItem.CartId,
                ProductId = cartItem.ProductId
            };
            collection.Add(cart);
        }

        return collection;
    }

    public async Task DeleteAllFromCartAsync(string username)
    {
        var sf = new SearchField
        {
            Search = username
        };

        await cartService.DeleteAllFromCartAsync(sf);
    }

    public async Task UpdateCartTotalAsync(string username)
    {
        var sf = new SearchField
        {
            Search = username
        };

        await cartService.UpdateCartTotalAsync(sf);
    }

    public async Task DeleteFromCartAsync(Shared.Models.CartItem cartItem)
    {
        var cartItemToSend = new CartItem
        {
            CartId = cartItem.CartId,
            ProductId = cartItem.ProductId
        };

        await cartService.DeleteFromCartAsync(cartItemToSend);
    }
}