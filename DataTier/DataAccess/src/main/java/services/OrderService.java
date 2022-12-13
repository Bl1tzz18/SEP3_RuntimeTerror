package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.OrderDAO;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.mappers.OrderItemMapper;
import org.dataaccess.mappers.OrderMapper;
import org.dataaccess.mappers.UserMapper;
import org.dataaccess.protobuf.Void;
import org.dataaccess.protobuf.*;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class OrderService extends OrderServiceGrpc.OrderServiceImplBase
{
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private UserDAO userDAO;

    public OrderService() {
    }

    @Override
    public void registerOrder(Order request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Order order = new org.dataaccess.Shared.Order(
                UserMapper.mapToShared(request.getUser()),
                request.getTotal(),
                request.getStatus()
        );

        orderDAO.registerOrder(order);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void registerOrderItem(OrderItems request, StreamObserver<Void> responseObserver)
    {
        Collection<org.dataaccess.Shared.OrderItem> orderItems = new ArrayList<>();

        for (var orderItem : request.getOrderItemsList())
        {
            orderItems.add(OrderItemMapper.mapToShared(orderItem));
        }

        orderDAO.registerOrderItems(orderItems);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void findOrder(SearchField request, StreamObserver<Order> responseObserver)
    {
        org.dataaccess.Shared.User user = userDAO.findUser(request.getSearch());

        org.dataaccess.Shared.Order order = orderDAO.getOrderByUser(user);

        if (order == null)
        {
            responseObserver.onError(new Exception("Order does not exist"));
            return;
        }

        responseObserver.onNext(OrderMapper.mapToProto(order));
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void updateOrderStatus(OrderStatus request, StreamObserver<Void> responseObserver)
    {
        orderDAO.updateOrderStatus(request.getUsername(), request.getStatus());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getOrdersByUsername(SearchField request, StreamObserver<Orders> responseObserver)
    {
        Collection<org.dataaccess.Shared.Order> orders = orderDAO.findAllByUser_UsernameAndStatus(request.getSearch());

        if (orders.isEmpty()) {
            responseObserver.onError(new Exception("No orders found"));
            return;
        }

        Collection<Order> orderCollection = new ArrayList<>();

        for (var order : orders)
        {
            orderCollection.add(OrderMapper.mapToProto(order));
        }

        Orders ordersToSend = Orders.newBuilder().addAllOrder(orderCollection).build();

        responseObserver.onNext(ordersToSend);
        responseObserver.onCompleted();
    }
}
