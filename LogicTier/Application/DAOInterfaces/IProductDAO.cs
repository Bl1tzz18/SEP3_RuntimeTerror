using Shared.Models;

namespace Application.DAOInterfaces;

public interface IProductDAO
{
    
    Task<Product> RegisterProductAsync(Product product); 
    
    Task<IEnumerable<Product>> GetProductsAsync();

    Task<IEnumerable<Product>> GetProductsInCartByUserAsync(string username);

    Task<Product> FindProductByIdAsync(string productId);
    
    Task DeleteProductAsync(string id);

    Task UpdateProductAsync(Product product);
}