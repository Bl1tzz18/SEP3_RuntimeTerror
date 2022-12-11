package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Product;

import java.util.Collection;

public interface ProductDAO
{
    Product registerProduct(Product product);

    Collection<Product> getProducts();

    Collection<Product> getAllProductFromCartByUsername(String username);

    Collection<Product> getAllProductsByOrderId(String orderId);

    Product findProduct(String productId);

    void deleteProduct(String productId);

    void updateProduct(Product product);

    Collection<Product> getAllProductsByName(String productName);

    Collection<Product> getAllProductsByCategoryName(String categoryName);
}
