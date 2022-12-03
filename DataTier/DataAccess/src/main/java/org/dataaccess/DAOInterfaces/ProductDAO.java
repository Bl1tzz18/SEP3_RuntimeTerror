package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Category;
import org.dataaccess.Shared.Product;

import java.util.Collection;

public interface ProductDAO
{
    Product registerProduct(Product product);

    Collection<Product> getProducts();

    Collection<Product> getAllProductFromCartByUsername(String username);

    Product findProduct(String productId);

    Category getCategory(String categoryName);

    void deleteProduct(String productId);

    void updateProduct(Product product);
}
