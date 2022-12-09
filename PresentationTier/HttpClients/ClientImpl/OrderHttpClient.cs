using System.Net.Http.Json;
using HttpClients.ClientInterfaces;

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
        // HttpResponseMessage response = await httpClient.PostAsync($"Order/order?username={username}",);
    }

    public async Task RegisterOrderItemAsync(string username)
    {
        throw new NotImplementedException();
    }
}