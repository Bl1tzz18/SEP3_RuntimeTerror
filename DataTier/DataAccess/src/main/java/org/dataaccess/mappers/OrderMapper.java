package org.dataaccess.mappers;

import org.dataaccess.protobuf.Order;

public abstract class OrderMapper
{
    public static Order mapToProto(org.dataaccess.Shared.Order order)
    {
        return Order.newBuilder()
                .setId(order.getId())
                .setUsername(order.getUser().getUsername())
                .setTotal(order.getTotal())
                .build();
    }
}
