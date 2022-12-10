using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Models;

namespace HttpClients.ClientImpl;

public class OrderHttpClient : IOrderService
{
    private readonly HttpClient httpClient;

    public OrderHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public async Task RegisterOrderAsync(string username)
    {
        StringContent content = new StringContent("", Encoding.UTF8, "application/json");

        HttpResponseMessage response =
            await httpClient.PostAsync($"https://localhost:7129/Order/order?username={username}", content);
        
        String responseContent = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            Console.WriteLine(responseContent);
            throw new Exception(responseContent);
        }
    }

    public async Task RegisterOrderItemAsync(string username)
    {
        StringContent content = new StringContent("", Encoding.UTF8, "application/json");

        HttpResponseMessage response =
            await httpClient.PostAsync($"https://localhost:7129/Order/orderItems?username={username}", content);
        
        String responseContent = await response.Content.ReadAsStringAsync();
        
        if (!response.IsSuccessStatusCode)
        {
            Console.WriteLine(responseContent);
            throw new Exception(responseContent);
        }
    }

    public async Task<ICollection<Order>> GetOrdersByUserAsync(string username)
    {
        HttpResponseMessage response =
            await httpClient.GetAsync($"/Order/getOrders?username={username}");
        
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
            throw new Exception(result);
        
        ICollection<Order> orders = JsonSerializer.Deserialize<ICollection<Order>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return orders;
    }
}