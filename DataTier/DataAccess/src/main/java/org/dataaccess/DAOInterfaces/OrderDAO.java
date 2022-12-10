package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.Order;
import org.dataaccess.Shared.OrderItem;
import org.dataaccess.Shared.User;

import java.util.Collection;

public interface OrderDAO
{
    void registerOrder(Order order);

    void registerOrderItems(Collection<OrderItem> orderItems);

    Order getOrderByUser(User username);

    void updateOrderStatus(String username, String status);

    Collection<Order> findAllByUser_UsernameAndStatus(String username);
}
