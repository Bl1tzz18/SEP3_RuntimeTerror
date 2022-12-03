namespace Shared.Models;

public class User
{
    public string userName { get; set; }
    public string password { get; set; }
    public string? FirstName { get; set; }
    public string? LastName { get; set; }
    public int Credits { get; set; }
    public string type { get; set; }
}