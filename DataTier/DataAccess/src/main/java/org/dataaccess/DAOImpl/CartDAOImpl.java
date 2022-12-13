package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.CartItem;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.CartItemsRepository;
import org.dataaccess.repositories.CartRepository;
import org.dataaccess.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class CartDAOImpl implements CartDAO
{
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemsRepository cartItemsRepository;

    @Autowired
    private UserRepository userRepository;

    public CartDAOImpl() {
    }

    @Override
    public void registerCart(Cart cart) {
        cartRepository.saveAndFlush(cart);
    }

    @Override
    public Cart getCartByUser(User username) {
        Cart cart = cartRepository.findByUser(username);
        if (cart != null)
            return cart;

        return null;
    }

    @Override
    public Cart getCartById(int cartId) {
        return cartRepository.findById(cartId);
    }

    @Override
    public void registerCartItem(CartItem cartItem) {
        cartItemsRepository.saveAndFlush(cartItem);
    }

    @Override
    public Collection<CartItem> getAllFromCartItemsByCartUser(User user) {
        return cartItemsRepository.findAllByCart_User(user);
    }

    @Override
    public void deleteFromCartItemsByUsername(String username) {
        cartItemsRepository.deleteFromCartItemsByUsername(username);
    }

    @Override
    public void updateCartTotal(String cartUser) {
        User user = userRepository.findUser(cartUser);
        Collection<CartItem> cartItems = cartItemsRepository.findAllByCart_User(user);
        if (!cartItems.isEmpty())
            cartRepository.updateCartTotal(cartUser);
        else
            cartRepository.updateCartTotalToZero(cartUser);
    }

    @Override
    public void deleteCartItemByProduct_IdAndCart_User_Username(CartItem cartItem) {
        cartItemsRepository.deleteCartItemByProduct_IdAndCart_User_Username(cartItem.getProduct().getId(), cartItem.getCart().getUser().getUsername());
    }
}
