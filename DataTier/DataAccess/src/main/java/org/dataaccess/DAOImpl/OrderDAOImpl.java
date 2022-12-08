package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.OrderDAO;
import org.dataaccess.Shared.Order;
import org.dataaccess.Shared.OrderItem;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.OrderItemsRepository;
import org.dataaccess.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class OrderDAOImpl implements OrderDAO
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    public OrderDAOImpl() {
    }

    @Override
    public void registerOrder(Order order)
    {
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void registerOrderItems(Collection<OrderItem> orderItems)
    {
        orderItemsRepository.saveAll(orderItems);
    }

    @Override
    public Order getOrderByUser(User username)
    {
        return orderRepository.findByUserAndStatus(username, "New");
    }

    @Override
    public void updateOrderStatus(String username, String status)
    {
        orderRepository.updateOrderStatus(username, status);
    }
}
