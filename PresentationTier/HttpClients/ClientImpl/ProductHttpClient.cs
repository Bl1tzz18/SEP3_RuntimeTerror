using System.Net.Http.Json;
using System.Text;
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

    public async Task DeleteProductAsync(string id)
    {
        HttpResponseMessage response = await httpClient.DeleteAsync($"/Products/deleteProduct?id={id}");
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
    }

    public async Task UpdateProductAsync(Product product)
    {
        String productAsJson = JsonSerializer.Serialize(product);
        StringContent content = new StringContent(productAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage response = await httpClient.PutAsync("/Products/updateProduct", content);
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
    }

    public async Task<Product> FindProductById(string productId)
    {
        HttpResponseMessage response =
            await httpClient.GetAsync($"/Products/findProductById?productId={productId}");
        string result = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
        
        var product = await response.Content.ReadFromJsonAsync<Product>();

        return product;
    }

    public async Task<ICollection<Product>> GetProductsByOrderIdAsync(string orderId)
    {
        HttpResponseMessage response =
            await httpClient.GetAsync($"/Products/getOrderProducts?orderId={orderId}");
        
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