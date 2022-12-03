package org.dataaccess.repositories;

import org.dataaccess.Shared.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
    @Query("SELECT p FROM Product p WHERE p.id IN (SELECT ci.product.id FROM CartItem ci WHERE ci.cart.user.username = ?1)")
    Collection<Product> getAllProductFromCartByUsername(String username);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Product SET name = ?2, imgPath = ?3, price = ?4, description = ?5, inStock = ?6 WHERE id = ?1")
    void updateProduct(int id, String name, String imgPath, int price, String description, boolean inStock);
}
