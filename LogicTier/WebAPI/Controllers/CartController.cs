using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class CartController : ControllerBase
{
    private readonly ICartLogic cartLogic;

    public CartController(ICartLogic cartLogic)
    {
        this.cartLogic = cartLogic;
    }

    /*[HttpPost("cart")]
    public async Task<IActionResult> RegisterCartAsync(CartCreationDTO dto)
    {
        try
        {
            await cartLogic.RegisterCartAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }*/
    
    [HttpPost("cartItem")]
    public async Task<IActionResult> RegisterCartItemAsync(CartItemCreationDTO dto)
    {
        try
        {
            await cartLogic.RegisterCartItemAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("getCartItems")]
    public async Task<IActionResult> GetAsync([FromQuery] string username)
    {
        try
        {
            var cart = await cartLogic.GetAllFromCartAsync(username);
            return Created("/cartitems", cart);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("getCart")]
    public async Task<IActionResult> FindCartAsync([FromQuery] string username)
    {
        try
        {
            var cart = await cartLogic.FindCartAsync(username);
            return Created("/cart", cart);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete("DeleteAllFromCartAsync")]
    public async Task<ActionResult> DeleteAsync([FromQuery] string username)
    {
        try
        {
            await cartLogic.DeleteAllFromCartAsync(username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete("DeleteFromCartAsync")]
    public async Task<ActionResult> DeleteItemAsync(CartItemCreationDTO dto)
    {
        try
        {
            await cartLogic.DeleteFromCartAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}