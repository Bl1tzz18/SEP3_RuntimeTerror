package org.dataaccess.mappers;

import org.dataaccess.protobuf.OrderItem;

public abstract class OrderItemMapper
{
    public static OrderItem mapToProto(org.dataaccess.Shared.OrderItem orderItem)
    {
        return OrderItem.newBuilder()
                .setId(orderItem.getId())
                .setCartId(orderItem.getOrder().getId())
                .setProductId(orderItem.getProduct().getId())
                .build();
    }
}
