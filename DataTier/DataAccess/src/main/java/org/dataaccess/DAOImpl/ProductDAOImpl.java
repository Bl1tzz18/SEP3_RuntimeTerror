package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.Shared.Category;
import org.dataaccess.Shared.Product;
import org.dataaccess.repositories.CategoryRepository;
import org.dataaccess.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ProductDAOImpl implements ProductDAO
{
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public ProductDAOImpl() {
    }

    @Override
    public Product registerProduct(Product product) {
        var category = categoryRepository.findCategory(product.getCategory().getCategory_name());
        if (category!=null)
            product.setCategory(category);

        categoryRepository.saveAndFlush(product.getCategory());

        productRepository.saveAndFlush(product);

        return product;
    }

    @Override
    public Collection<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Collection<Product> getAllProductFromCartByUsername(String username) {
        return productRepository.getAllProductFromCartByUsername(username);
    }

    @Override
    public Product findProduct(String productId) {
        return productRepository.findById(Integer.valueOf(productId)).orElse(null);
    }

    @Override
    public Category getCategory(String categoryName) {
        return categoryRepository.findCategory(categoryName);
    }

    @Override
    public void deleteProduct(String productId) {
        productRepository.deleteById(Integer.valueOf(productId));
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product.getId(), product.getName(), product.getImgPath(),product.getPrice(), product.getDescription(), product.isInStock());
    }
}
