package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.DAOInterfaces.OrderDAO;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.Shared.Cart;
import org.dataaccess.Shared.CartItem;
import org.dataaccess.mappers.OrderItemMapper;
import org.dataaccess.mappers.OrderMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class OrderService extends OrderServiceGrpc.OrderServiceImplBase
{
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private UserDAO userDAO;

    public OrderService() {
    }

    @Override
    public void registerOrder(Order request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Order order = new org.dataaccess.Shared.Order();

        org.dataaccess.Shared.User user = userDAO.findUser(request.getUser().getUsername());

        order.setUser(user);

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
}
