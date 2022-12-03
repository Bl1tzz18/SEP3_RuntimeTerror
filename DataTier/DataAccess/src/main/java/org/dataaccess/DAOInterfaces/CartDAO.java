package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.CartItem;
import org.dataaccess.Shared.User;

import java.util.Collection;

public interface CartDAO
{
    void registerCart(Cart cart);

    Cart getCartByUser(User username);

    Cart getCartById(int cartId);

    void registerCartItem(CartItem cartItem);

    Collection<CartItem> getAllFromCartItemsByCartUser(User user);

    void deleteFromCartItemsByUsername(String username);

    void updateCartTotal(String cartUser);

    void deleteCartItemByProduct_IdAndCart_User_Username(CartItem cartItem);
}
