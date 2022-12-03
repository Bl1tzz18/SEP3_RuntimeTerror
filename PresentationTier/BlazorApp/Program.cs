using BlazorApp;
using BlazorApp.Auth;
using BlazorApp.Services;
using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using HttpClients.ClientImpl;
using HttpClients.ClientInterfaces;
using Microsoft.AspNetCore.Components.Authorization;
using Shared.Auth;

var builder = WebAssemblyHostBuilder.CreateDefault(args);

builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri("https://localhost:7129") });


builder.Services.AddScoped<IUserService, UserHttpClient>();
builder.Services.AddScoped<IProductService, ProductHttpClient>();

builder.Services.AddScoped<IAuthService, JwtAuthService>();
builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();


builder.Services.AddScoped<ICartService, CartHttpClient>();


AuthorizationPolicies.AddPolicies(builder.Services);
await builder.Build().RunAsync();