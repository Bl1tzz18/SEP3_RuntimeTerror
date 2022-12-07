package org.dataaccess.mappers;

import org.dataaccess.protobuf.OrderItem;

public abstract class OrderItemMapper
{
    public static OrderItem mapToProto(org.dataaccess.Shared.OrderItem orderItem)
    {
        return OrderItem.newBuilder()
                .setId(orderItem.getId())
                .setOrder(OrderMapper.mapToProto(orderItem.getOrder()))
                .setProduct(ProductMapper.mapToProto(orderItem.getProduct()))
                .build();
    }

    public static org.dataaccess.Shared.OrderItem mapToShared(OrderItem orderItem)
    {
        return new org.dataaccess.Shared.OrderItem(
                orderItem.getId(),
                OrderMapper.mapToShared(orderItem.getOrder()),
                ProductMapper.mapToShared(orderItem.getProduct())
        );
    }
}
