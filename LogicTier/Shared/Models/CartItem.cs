namespace Shared.Models;

public class CartItem
{
    public int Id { get; set; }
    
    public int CartId { get; set; }
    
    public int ProductId { get; set; }
}