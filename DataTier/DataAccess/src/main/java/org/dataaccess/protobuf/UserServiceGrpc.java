package org.dataaccess.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.RegisterUser,
      org.dataaccess.protobuf.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = org.dataaccess.protobuf.RegisterUser.class,
      responseType = org.dataaccess.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.RegisterUser,
      org.dataaccess.protobuf.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.RegisterUser, org.dataaccess.protobuf.User> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.RegisterUser, org.dataaccess.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.RegisterUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.LoginUser,
      org.dataaccess.protobuf.User> getLoginUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUsers",
      requestType = org.dataaccess.protobuf.LoginUser.class,
      responseType = org.dataaccess.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.LoginUser,
      org.dataaccess.protobuf.User> getLoginUsersMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.LoginUser, org.dataaccess.protobuf.User> getLoginUsersMethod;
    if ((getLoginUsersMethod = UserServiceGrpc.getLoginUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginUsersMethod = UserServiceGrpc.getLoginUsersMethod) == null) {
          UserServiceGrpc.getLoginUsersMethod = getLoginUsersMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.LoginUser, org.dataaccess.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.LoginUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LoginUsers"))
              .build();
        }
      }
    }
    return getLoginUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.User> getFindUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindUser",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.User> getFindUserMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.User> getFindUserMethod;
    if ((getFindUserMethod = UserServiceGrpc.getFindUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFindUserMethod = UserServiceGrpc.getFindUserMethod) == null) {
          UserServiceGrpc.getFindUserMethod = getFindUserMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("FindUser"))
              .build();
        }
      }
    }
    return getFindUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser,
      org.dataaccess.protobuf.Void> getAddCreditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCredits",
      requestType = org.dataaccess.protobuf.CreditsUser.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser,
      org.dataaccess.protobuf.Void> getAddCreditsMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser, org.dataaccess.protobuf.Void> getAddCreditsMethod;
    if ((getAddCreditsMethod = UserServiceGrpc.getAddCreditsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddCreditsMethod = UserServiceGrpc.getAddCreditsMethod) == null) {
          UserServiceGrpc.getAddCreditsMethod = getAddCreditsMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.CreditsUser, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCredits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CreditsUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddCredits"))
              .build();
        }
      }
    }
    return getAddCreditsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser,
      org.dataaccess.protobuf.Void> getRemoveCreditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCredits",
      requestType = org.dataaccess.protobuf.CreditsUser.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser,
      org.dataaccess.protobuf.Void> getRemoveCreditsMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.CreditsUser, org.dataaccess.protobuf.Void> getRemoveCreditsMethod;
    if ((getRemoveCreditsMethod = UserServiceGrpc.getRemoveCreditsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveCreditsMethod = UserServiceGrpc.getRemoveCreditsMethod) == null) {
          UserServiceGrpc.getRemoveCreditsMethod = getRemoveCreditsMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.CreditsUser, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCredits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CreditsUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveCredits"))
              .build();
        }
      }
    }
    return getRemoveCreditsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(org.dataaccess.protobuf.RegisterUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void loginUsers(org.dataaccess.protobuf.LoginUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUsersMethod(), responseObserver);
    }

    /**
     */
    public void findUser(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindUserMethod(), responseObserver);
    }

    /**
     */
    public void addCredits(org.dataaccess.protobuf.CreditsUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCreditsMethod(), responseObserver);
    }

    /**
     */
    public void removeCredits(org.dataaccess.protobuf.CreditsUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCreditsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.RegisterUser,
                org.dataaccess.protobuf.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getLoginUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.LoginUser,
                org.dataaccess.protobuf.User>(
                  this, METHODID_LOGIN_USERS)))
          .addMethod(
            getFindUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.User>(
                  this, METHODID_FIND_USER)))
          .addMethod(
            getAddCreditsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.CreditsUser,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_ADD_CREDITS)))
          .addMethod(
            getRemoveCreditsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.CreditsUser,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_REMOVE_CREDITS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(org.dataaccess.protobuf.RegisterUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUsers(org.dataaccess.protobuf.LoginUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUser(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCredits(org.dataaccess.protobuf.CreditsUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCreditsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeCredits(org.dataaccess.protobuf.CreditsUser request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCreditsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dataaccess.protobuf.User createUser(org.dataaccess.protobuf.RegisterUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.User loginUsers(org.dataaccess.protobuf.LoginUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.User findUser(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void addCredits(org.dataaccess.protobuf.CreditsUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCreditsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void removeCredits(org.dataaccess.protobuf.CreditsUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCreditsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.User> createUser(
        org.dataaccess.protobuf.RegisterUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.User> loginUsers(
        org.dataaccess.protobuf.LoginUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.User> findUser(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> addCredits(
        org.dataaccess.protobuf.CreditsUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCreditsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> removeCredits(
        org.dataaccess.protobuf.CreditsUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCreditsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_LOGIN_USERS = 1;
  private static final int METHODID_FIND_USER = 2;
  private static final int METHODID_ADD_CREDITS = 3;
  private static final int METHODID_REMOVE_CREDITS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((org.dataaccess.protobuf.RegisterUser) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User>) responseObserver);
          break;
        case METHODID_LOGIN_USERS:
          serviceImpl.loginUsers((org.dataaccess.protobuf.LoginUser) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User>) responseObserver);
          break;
        case METHODID_FIND_USER:
          serviceImpl.findUser((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.User>) responseObserver);
          break;
        case METHODID_ADD_CREDITS:
          serviceImpl.addCredits((org.dataaccess.protobuf.CreditsUser) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_REMOVE_CREDITS:
          serviceImpl.removeCredits((org.dataaccess.protobuf.CreditsUser) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dataaccess.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getLoginUsersMethod())
              .addMethod(getFindUserMethod())
              .addMethod(getAddCreditsMethod())
              .addMethod(getRemoveCreditsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
