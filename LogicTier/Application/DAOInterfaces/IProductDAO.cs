using Shared.Models;

namespace Application.DAOInterfaces;

public interface IProductDAO
{
    
    Task<Product> RegisterProductAsync(Product product); 
    
    Task<IEnumerable<Product>> GetProductsAsync();

    Task<IEnumerable<Product>> GetProductsInCartByUserAsync(string username);
    
    // Task<IEnumerable<Product>> GetProductOrderHistoryAsync(string username);

    Task<IEnumerable<Product>> GetProductsByOrderIdAsync(string orderId);


    Task<Product> FindProductByIdAsync(string productId);
    
    Task DeleteProductAsync(string id);

    Task UpdateProductAsync(Product product);

    Task<IEnumerable<Product>> GetProductsByNameAsync(string productName);
    
    Task<IEnumerable<Product>> GetProductsByCategoryNameAsync(string categoryName);
}