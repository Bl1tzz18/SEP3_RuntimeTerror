package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.CartDAO;
import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.mappers.UserMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.dataaccess.repositories.UserRepository;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase
{
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private CartDAO cartDAO;

    public UserService()
    {
    }

    @Override
    public void loginUsers(LoginUser request, StreamObserver<User> responseObserver)
    {
        org.dataaccess.Shared.User user = new org.dataaccess.Shared.User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        org.dataaccess.Shared.User loginUser = userDAO.loginUser(user);

        responseObserver.onNext(UserMapper.mapProto(loginUser));
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(RegisterUser request, StreamObserver<User> responseObserver)
    {
        org.dataaccess.Shared.User user = new org.dataaccess.Shared.User(
                request.getUsername(),
                request.getPassword(),
                request.getFName(),
                request.getLName());

        org.dataaccess.Shared.User registerUser = userDAO.registerUser(user);

        responseObserver.onNext(UserMapper.mapProto(registerUser));
        responseObserver.onCompleted();

    }

    @Override
    public void findUser(SearchField request, StreamObserver<User> responseObserver)
    {
        org.dataaccess.Shared.User user = userDAO.findUser(request.getSearch());

        if (user != null)
        {
            responseObserver.onNext(UserMapper.mapProto(user));
            responseObserver.onCompleted();
        }
        else
        {
            responseObserver.onError(new Exception("Error: The user does not exist"));
        }
    }

    @Transactional
    @Override
    public void addCredits(CreditsUser request, StreamObserver<Void> responseObserver)
    {
        userDAO.addCredits(request.getCredits(), request.getUsername());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void removeCredits(CreditsUser request, StreamObserver<Void> responseObserver)
    {
        userDAO.removeCredits(request.getCredits(), request.getUsername());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
