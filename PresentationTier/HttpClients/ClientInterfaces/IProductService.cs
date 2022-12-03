using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientInterfaces;

public interface IProductService
{
    Task<Product> CreateProductAsync(ProductCreationDTO dto);
    
    Task<ICollection<Product>> GetProductsAsync();

    Task<ICollection<Product>> GetProductsInCartByUserAsync(string username);
}