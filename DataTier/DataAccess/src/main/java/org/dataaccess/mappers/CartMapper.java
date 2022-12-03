package org.dataaccess.mappers;

import org.dataaccess.protobuf.Cart;

public abstract class CartMapper
{
    public static Cart mapToProto(org.dataaccess.Shared.Cart cart)
    {
        return Cart.newBuilder()
                .setId(cart.getId())
                .setUsername(cart.getUser().getUsername())
                .setTotal(cart.getTotal())
                .build();
    }
}
