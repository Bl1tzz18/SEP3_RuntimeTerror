package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.mappers.CartItemMapper;
import org.dataaccess.mappers.CartMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class CartService extends CartServiceGrpc.CartServiceImplBase
{
    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductDAO productDAO;

    public CartService() {
    }

    @Override
    public void registerCart(Cart request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Cart cart = new org.dataaccess.Shared.Cart();

        org.dataaccess.Shared.User user = userDAO.findUser(request.getUsername());


        cart.setUser(user);

        cartDAO.registerCart(cart);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void registerCartItem(CartItem request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Cart cart = cartDAO.getCartById(request.getCartId());

        org.dataaccess.Shared.Product product = productDAO.findProduct(String.valueOf(request.getProductId()));

        org.dataaccess.Shared.CartItem cartItem = new org.dataaccess.Shared.CartItem(
                cart,
                product
        );

        cartDAO.registerCartItem(cartItem);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void findCart(SearchField request, StreamObserver<Cart> responseObserver)
    {
        org.dataaccess.Shared.User user = userDAO.findUser(request.getSearch());

        org.dataaccess.Shared.Cart cart = cartDAO.getCartByUser(user);

        if (cart == null)
        {
            responseObserver.onError(new Exception("Cart does not exist"));
            return;
        }

        responseObserver.onNext(CartMapper.mapToProto(cart));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllFromCart(SearchField request, StreamObserver<CartItems> responseObserver)
    {
        Collection<org.dataaccess.Shared.CartItem> cartItems = cartDAO.getAllFromCartItemsByCartUser(userDAO.findUser(request.getSearch()));

        Collection<CartItem> cartItemsProto = new ArrayList<>();

        if (cartItems == null)
        {
            responseObserver.onError(new Exception("Cart products not found"));
            return;
        }

        for (org.dataaccess.Shared.CartItem cartItem : cartItems)
        {
            cartItemsProto.add(CartItemMapper.mapToProto(cartItem));
        }

        CartItems cartItemsToSend = CartItems.newBuilder().addAllCartItems(cartItemsProto).build();

        responseObserver.onNext(cartItemsToSend);
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void deleteAllFromCart(SearchField request, StreamObserver<Void> responseObserver)
    {
        cartDAO.deleteFromCartItemsByUsername(request.getSearch());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void updateCartTotal(SearchField request, StreamObserver<Void> responseObserver)
    {
        cartDAO.updateCartTotal(request.getSearch());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void deleteFromCart(CartItem request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Cart cart = cartDAO.getCartById(request.getCartId());

        org.dataaccess.Shared.Product product = productDAO.findProduct(String.valueOf(request.getProductId()));

        org.dataaccess.Shared.CartItem cartItem = new org.dataaccess.Shared.CartItem(
                cart,
                product
        );

        cartDAO.deleteCartItemByProduct_IdAndCart_User_Username(cartItem);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
