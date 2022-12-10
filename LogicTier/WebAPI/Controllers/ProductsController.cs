using Application.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;
using Shared.DTOs;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ProductsController : ControllerBase
{
    private readonly IProductLogic productLogic;

    public ProductsController(IProductLogic productLogic)
    {
        this.productLogic = productLogic;
    }

    [HttpPost]
    public async Task<IActionResult> RegisterAsync(ProductCreationDTO dto)
    {
        try
        {
            Shared.Models.Product product = await productLogic.RegisterProductAsync(dto);
            return Created($"/products/{product.Id}", product);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [Route("getproducts")]
    [HttpGet]
    public async Task<IActionResult> GetAsync()
    {
        try
        {
            var created = await productLogic.GetProductsAsync();
            return Created($"/products", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("getcartproducts")]
    [HttpGet]
    public async Task<IActionResult> GetProductsInCartByUserAsync([FromQuery] string username)
    {
        try
        {
            var products = await productLogic.GetProductsInCartByUserAsync(username);
            return Created("/cartproducts", products);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    // [Route("getorderhistory")]
    // [HttpGet]
    // public async Task<IActionResult> GetProductOrderHistoryAsync([FromQuery] string username)
    // {
    //     try
    //     {
    //         var products = await productLogic.GetProductOrderHistoryAsync(username);
    //         return Created("/orderhistory", products);
    //     }
    //     catch (Exception e)
    //     {
    //         Console.WriteLine(e);
    //         return StatusCode(500, e.Message);
    //     }
    // }

    [Route("deleteProduct")]
    [HttpDelete]
    public async Task<ActionResult> DeleteProductAsync([FromQuery] string id)
    {
        try
        {
            await productLogic.DeleteProductAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("updateProduct")]
    [HttpPut]
    public async Task<ActionResult> UpdateProductAsync(Shared.Models.Product product)
    {
        try
        {
            await productLogic.UpdateProductAsync(product);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [Route("findProductById")]
    [HttpGet]
    public async Task<ActionResult> FindProductByIdAsync(string productId)
    {
        try
        {
            var product = await productLogic.FindProductByIdAsync(productId);
            
            return Created("/product",product);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("getOrderProducts")]
    public async Task<IActionResult> GetProductsByOrderIdAsync(string orderId)
    {
        try
        {
            var products = await productLogic.GetProductsByOrderIdAsync(orderId);
            return Created("/getProductsByOrderId", products);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}