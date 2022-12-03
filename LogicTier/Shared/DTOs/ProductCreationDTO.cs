using Shared.Models;

namespace Shared.DTOs;

public class ProductCreationDTO
{
    public string Name { get; set; }
    
    public string ImagePath { get; set; }
    
    public int Price { get; set; }
    
    public string? Description { get; set; }
    
    public bool InStock { get; set; }
    
    public Category Category { get; set; }
}