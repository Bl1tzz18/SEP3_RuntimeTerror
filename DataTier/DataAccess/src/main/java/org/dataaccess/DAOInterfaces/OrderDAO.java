package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Order;
import org.dataaccess.Shared.OrderItem;

import java.util.Collection;

public interface OrderDAO
{
    void registerOrder(Order order);

    void registerOrderItems(Collection<OrderItem> orderItems);
}
