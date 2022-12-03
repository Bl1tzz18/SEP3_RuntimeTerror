using System.Security.Claims;
using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using System.IdentityModel.Tokens.Jwt;
using System.Text;
using Microsoft.IdentityModel.Tokens;
using Shared.DTOs;


namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController : ControllerBase
{
    private readonly IUserLogic UserLogic;
    private readonly IConfiguration config;

    public UserController(IUserLogic userLogic, IConfiguration config)
    {
        UserLogic = userLogic;
        this.config = config;
    }


    
    [HttpPost("register")]
    public async Task<IActionResult> CreateUserAsync(UserCreationDTO dto)
    {
        try
        {
            
            var user = await UserLogic.CreateUserAsync(dto);
            String token = GenerateJwt(user);
            
            return Ok(token);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return BadRequest(e.Message);
        }
    }

    [HttpPost("login")]
    public async Task<IActionResult> LoginUserAsync(UserLoginDTO dto)
    {
        try
        {
            var user = await UserLogic.LoginUserAsync(dto);
            String token = GenerateJwt(user);
            
            return Ok(token);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return BadRequest(e.Message);
        }
    }
    
    [HttpPut("addcredits")]
    public async Task<ActionResult> AddCreditsAsync([FromQuery] int credits, string username)
    {
        try
        {
            await UserLogic.AddCreditsAsync(credits, username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpPut("removecredits")]
    public async Task<ActionResult> RemoveCreditsAsync([FromQuery] int credits, string username)
    {
        try
        {
            await UserLogic.RemoveCreditsAsync(credits, username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    // JWT - Auth
    private List<Claim> GenerateClaims(Shared.Models.User user)
    {
        var claims = new[]
        {
            new Claim(JwtRegisteredClaimNames.Sub, config["Jwt:Subject"]),
            new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString()),
            new Claim(JwtRegisteredClaimNames.Iat, DateTime.UtcNow.ToString()),
            new Claim(ClaimTypes.Name, user.userName),
            new Claim(ClaimTypes.Role, user.type),
            new Claim("First Name", user.FirstName),
            new Claim("Last Name", user.LastName),
            new Claim("Credits", user.Credits.ToString())
        };
        return claims.ToList();
    }
    
    private string GenerateJwt(Shared.Models.User user)
    {
        List<Claim> claims = GenerateClaims(user);
    
        SymmetricSecurityKey key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        SigningCredentials signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);
    
        JwtHeader header = new JwtHeader(signIn);
    
        JwtPayload payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims, 
            null,
            DateTime.UtcNow.AddMinutes(60));
    
        JwtSecurityToken token = new JwtSecurityToken(header, payload);
    
        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);
        return serializedToken;
    }
}