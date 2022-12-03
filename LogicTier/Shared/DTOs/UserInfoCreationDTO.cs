using Shared.Models;

namespace Shared.DTOs;

public class UserInfoCreationDTO
{
    public string username { get; set; }
    
    public string FirstName { get; set; }
    
    public string LastName { get; set; }

    public string phone { get; set; }
    
    public Address Address { get; set; }
}