namespace Shared.Models;

public class Order
{
    public int Id { get; set; }

    public User User { get; set; }

    public int Total { get; set; }
}