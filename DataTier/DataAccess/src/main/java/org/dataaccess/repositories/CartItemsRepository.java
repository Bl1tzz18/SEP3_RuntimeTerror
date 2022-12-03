package org.dataaccess.repositories;

import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.CartItem;
import org.dataaccess.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItem, Integer>
{
    Collection<CartItem> findAllByCart_User(User user);

    @Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cart.id = (SELECT c.id FROM Cart c WHERE c.user.username = ?1)")
    void deleteFromCartItemsByUsername(String userName);

    void deleteCartItemByProduct_IdAndCart_User_Username(int productId, String username);
}
