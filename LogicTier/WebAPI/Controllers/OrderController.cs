using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class OrderController : ControllerBase
{
    private readonly IOrderLogic orderLogic;

    public OrderController(IOrderLogic orderLogic)
    {
        this.orderLogic = orderLogic;
    }

    [HttpPost("order")]
    public async Task<IActionResult> RegisterOrderAsync([FromQuery] string username)
    {
        try
        {
            await orderLogic.RegisterOrderAsync(username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpPost("orderItems")]
    public async Task<IActionResult> RegisterOrderItemsAsync([FromQuery] string username)
    {
        try
        {
            await orderLogic.RegisterOrderItemsAsync(username);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}