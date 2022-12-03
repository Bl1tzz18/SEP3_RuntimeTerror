package org.dataaccess.mappers;

import org.dataaccess.protobuf.CartItem;

public abstract class CartItemMapper
{
    public static CartItem mapToProto(org.dataaccess.Shared.CartItem cartItem)
    {
        return CartItem.newBuilder()
                .setId(cartItem.getId())
                .setCartId(cartItem.getCart().getId())
                .setProductId(cartItem.getProduct().getId())
                .build();
    }
}
