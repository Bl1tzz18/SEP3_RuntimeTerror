using Shared.DTOs;
using Shared.Models;

namespace Application.LogicInterfaces;

public interface IProductLogic
{
    Task<Product> RegisterProductAsync(ProductCreationDTO dto);
    
    Task<IEnumerable<Product>> GetProductsAsync();

    Task<IEnumerable<Product>> GetProductsInCartByUserAsync(string username);
    
    Task<Product> FindProductByIdAsync(string productId);

    Task DeleteProductAsync(string id);

    Task UpdateProductAsync(Product product);
}