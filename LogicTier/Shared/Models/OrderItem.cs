﻿namespace Shared.Models;

public class OrderItem
{
    public int Id { get; set; }
    
    public Order Order { get; set; }
    
    public Product Product { get; set; }
}