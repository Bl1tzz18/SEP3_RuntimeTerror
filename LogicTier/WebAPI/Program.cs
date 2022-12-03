using System.Text;
using Application.DAOInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using GrpcClient.DAO;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;
using Shared.Auth;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();


// =========================== USER =========================
builder.Services.AddGrpcClient<UserService.UserServiceClient>(o =>
{
    o.Address = new Uri("http://localhost:6565");
});
builder.Services.AddScoped<IUserDAO, UserDao>();
builder.Services.AddScoped<IUserLogic, UserLogic>();



// =========================== PRODUCT =========================
builder.Services.AddGrpcClient<ProductService.ProductServiceClient>(o =>
{
    o.Address = new Uri("http://localhost:6565");
});
builder.Services.AddScoped<IProductDAO, ProductDao>();
builder.Services.AddScoped<IProductLogic, ProductLogic>();

builder.Services.AddGrpcClient<CartService.CartServiceClient>(o =>
{
    o.Address = new Uri("http://localhost:6565");
});
builder.Services.AddScoped<ICartDAO, CartDao>();
builder.Services.AddScoped<ICartLogic, CartLogic>();

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});

AuthorizationPolicies.AddPolicies(builder.Services);


var app = builder.Build();



// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseStaticFiles();

app.UseAuthentication();

app.UseAuthorization();

app.MapControllers();

//Configure CORS
app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true)
    .AllowCredentials());

app.Run();