using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IProductService
{
    Task<Product> CreateProductAsync(ProductCreationDTO dto);
    
    Task<ICollection<Product>> GetProductsAsync();

    Task<ICollection<Product>> GetProductsInCartByUserAsync(string username);

    Task DeleteProductAsync(string id);
    Task UpdateProductAsync(Product product);

    Task<Product> FindProductById(string productId);

    Task<ICollection<Product>> GetProductsByOrderIdAsync(string orderId);
    public Task<ICollection<Product>> GetProductsByNameAsync(string productName);
    public Task<ICollection<Product>> GetProductsByCategoryName(string categoryName);
}