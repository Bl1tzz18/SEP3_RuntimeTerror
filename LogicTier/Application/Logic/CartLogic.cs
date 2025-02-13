﻿using System.Collections.ObjectModel;
using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class CartLogic : ICartLogic
{
    private readonly ICartDAO cartDao;
    private readonly IProductDAO productDao;

    public CartLogic(ICartDAO cartDao, IProductDAO productDao)
    {
        this.cartDao = cartDao;
        this.productDao = productDao;
    }

    public async Task RegisterCartItemAsync(CartItemCreationDTO dto)
    {
        Cart cart = await cartDao.FindCartAsync(dto.UserName);

        Product product = await productDao.FindProductByIdAsync(dto.ProductId.ToString());

        if (cart == null)
        {
            throw new Exception("Cart does not exist");
        }

        if (product == null)
        {
            throw new Exception("Product does not exist");
        }

        ICollection<CartItem> cartItems = await cartDao.GetAllFromCartAsync(dto.UserName);

        foreach (var item in cartItems)
        {
            if (item.ProductId == product.Id)
            {
                throw new Exception("Product already in cart");
            }
        }

        CartItem cartItem = new CartItem
        {
            CartId = cart.Id,
            ProductId = dto.ProductId
        };

        await cartDao.RegisterCartItemAsync(cartItem);
        
        await cartDao.UpdateCartTotalAsync(dto.UserName);
    }

    public async Task<Cart> FindCartAsync(string username)
    {
        Cart cart = await cartDao.FindCartAsync(username);
        
        if (cart == null)
        {
            throw new Exception("The cart does not exists");
        }
        
        await cartDao.UpdateCartTotalAsync(username);

        return await cartDao.FindCartAsync(username);
    }

    public async Task<ICollection<CartItem>> GetAllFromCartAsync(string username)
    {
        Cart cart = await cartDao.FindCartAsync(username);
        
        if (cart == null)
        {
            throw new Exception("The cart does not exists");
        }

        return await cartDao.GetAllFromCartAsync(username);
    }

    public async Task DeleteAllFromCartAsync(string username)
    {
        Cart cart = await cartDao.FindCartAsync(username);
        
        if (cart == null)
        {
            throw new Exception("The cart does not exists");
        }

        await cartDao.DeleteAllFromCartAsync(username);
    }

    public async Task DeleteFromCartAsync(CartItemCreationDTO dto)
    {
        Cart cart = await cartDao.FindCartAsync(dto.UserName);
        
        Product product = await productDao.FindProductByIdAsync(dto.ProductId.ToString());

        if (cart == null)
        {
            throw new Exception("Cart does not exist");
        }

        if (product == null)
        {
            throw new Exception("Product does not exist");
        }

        CartItem cartItem = new CartItem
        {
            CartId = cart.Id,
            ProductId = dto.ProductId
        };

        await cartDao.DeleteFromCartAsync(cartItem);
    }
}