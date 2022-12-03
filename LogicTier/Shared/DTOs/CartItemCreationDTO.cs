using Shared.Models;

namespace Shared.DTOs;

public class CartItemCreationDTO
{
    public int ProductId { get; set; }

    public string UserName { get; set; }
}