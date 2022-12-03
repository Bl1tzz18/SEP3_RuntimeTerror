using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace HttpClients.ClientImpl;

public class ProductHttpClient : IProductService
{
    private readonly HttpClient httpClient;


    public ProductHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }
    
    
    
    //if does not work like this, I know how to fix it
    public async Task<Product> CreateProductAsync(ProductCreationDTO dto)
    {
        HttpResponseMessage response = await httpClient.PostAsJsonAsync("/Products", dto);
        
        
        if (!response.IsSuccessStatusCode)
        {
            string result = await response.Content.ReadAsStringAsync();
            throw new Exception(result);
        }

        var product = await response.Content.ReadFromJsonAsync<Product>();
        
        
        // var product = JsonSerializer.Deserialize<Product>(result, new JsonSerializerOptions
        // {
        //     PropertyNameCaseInsensitive = true
        // })!;
        if (product == null)
        {
            throw new Exception("Read User - Error");
        }
        
        return product;
    }

    public async Task<ICollection<Product>> GetProductsAsync()
    {
        HttpResponseMessage response = await httpClient.GetAsync("/Products/getproducts");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);

        ICollection<Product> products = JsonSerializer.Deserialize<ICollection<Product>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return products;
    }

    public async Task<ICollection<Product>> GetProductsInCartByUserAsync(string username)
    {
        HttpResponseMessage response =
            await httpClient.GetAsync($"/Products/getcartproducts?username={username}");
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
        
        ICollection<Product> products = JsonSerializer.Deserialize<ICollection<Product>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return products;
    }
}