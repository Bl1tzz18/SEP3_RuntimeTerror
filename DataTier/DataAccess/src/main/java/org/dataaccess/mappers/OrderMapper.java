package org.dataaccess.mappers;

import org.dataaccess.protobuf.Order;

public abstract class OrderMapper
{
    public static Order mapToProto(org.dataaccess.Shared.Order order)
    {
        return Order.newBuilder()
                .setId(order.getId())
                .setUser(UserMapper.mapProto(order.getUser()))
                .setTotal(order.getTotal())
                .setStatus(order.getStatus())
                .build();
    }

    public static org.dataaccess.Shared.Order mapToShared(Order order)
    {
        return new org.dataaccess.Shared.Order(
                order.getId(),
                UserMapper.mapToShared(order.getUser()),
                order.getTotal(),
                order.getStatus()
        );
    }
}
