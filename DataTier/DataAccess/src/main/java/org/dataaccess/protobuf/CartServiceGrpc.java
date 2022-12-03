package org.dataaccess.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart,
      org.dataaccess.protobuf.Void> getRegisterCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterCart",
      requestType = org.dataaccess.protobuf.Cart.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart,
      org.dataaccess.protobuf.Void> getRegisterCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.Cart, org.dataaccess.protobuf.Void> getRegisterCartMethod;
    if ((getRegisterCartMethod = CartServiceGrpc.getRegisterCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getRegisterCartMethod = CartServiceGrpc.getRegisterCartMethod) == null) {
          CartServiceGrpc.getRegisterCartMethod = getRegisterCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.Cart, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Cart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("RegisterCart"))
              .build();
        }
      }
    }
    return getRegisterCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem,
      org.dataaccess.protobuf.Void> getRegisterCartItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterCartItem",
      requestType = org.dataaccess.protobuf.CartItem.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem,
      org.dataaccess.protobuf.Void> getRegisterCartItemMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem, org.dataaccess.protobuf.Void> getRegisterCartItemMethod;
    if ((getRegisterCartItemMethod = CartServiceGrpc.getRegisterCartItemMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getRegisterCartItemMethod = CartServiceGrpc.getRegisterCartItemMethod) == null) {
          CartServiceGrpc.getRegisterCartItemMethod = getRegisterCartItemMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.CartItem, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterCartItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CartItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("RegisterCartItem"))
              .build();
        }
      }
    }
    return getRegisterCartItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Cart> getFindCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindCart",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Cart.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Cart> getFindCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Cart> getFindCartMethod;
    if ((getFindCartMethod = CartServiceGrpc.getFindCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getFindCartMethod = CartServiceGrpc.getFindCartMethod) == null) {
          CartServiceGrpc.getFindCartMethod = getFindCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Cart>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Cart.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("FindCart"))
              .build();
        }
      }
    }
    return getFindCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllFromCart",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.CartItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.CartItems> getGetAllFromCartMethod;
    if ((getGetAllFromCartMethod = CartServiceGrpc.getGetAllFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetAllFromCartMethod = CartServiceGrpc.getGetAllFromCartMethod) == null) {
          CartServiceGrpc.getGetAllFromCartMethod = getGetAllFromCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.CartItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CartItems.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetAllFromCart"))
              .build();
        }
      }
    }
    return getGetAllFromCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAllFromCart",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void> getDeleteAllFromCartMethod;
    if ((getDeleteAllFromCartMethod = CartServiceGrpc.getDeleteAllFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteAllFromCartMethod = CartServiceGrpc.getDeleteAllFromCartMethod) == null) {
          CartServiceGrpc.getDeleteAllFromCartMethod = getDeleteAllFromCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAllFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteAllFromCart"))
              .build();
        }
      }
    }
    return getDeleteAllFromCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getUpdateCartTotalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCartTotal",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getUpdateCartTotalMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void> getUpdateCartTotalMethod;
    if ((getUpdateCartTotalMethod = CartServiceGrpc.getUpdateCartTotalMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getUpdateCartTotalMethod = CartServiceGrpc.getUpdateCartTotalMethod) == null) {
          CartServiceGrpc.getUpdateCartTotalMethod = getUpdateCartTotalMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCartTotal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("UpdateCartTotal"))
              .build();
        }
      }
    }
    return getUpdateCartTotalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem,
      org.dataaccess.protobuf.Void> getDeleteFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFromCart",
      requestType = org.dataaccess.protobuf.CartItem.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem,
      org.dataaccess.protobuf.Void> getDeleteFromCartMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.CartItem, org.dataaccess.protobuf.Void> getDeleteFromCartMethod;
    if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
          CartServiceGrpc.getDeleteFromCartMethod = getDeleteFromCartMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.CartItem, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.CartItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteFromCart"))
              .build();
        }
      }
    }
    return getDeleteFromCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerCart(org.dataaccess.protobuf.Cart request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterCartMethod(), responseObserver);
    }

    /**
     */
    public void registerCartItem(org.dataaccess.protobuf.CartItem request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterCartItemMethod(), responseObserver);
    }

    /**
     */
    public void findCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Cart> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindCartMethod(), responseObserver);
    }

    /**
     */
    public void getAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFromCartMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllFromCartMethod(), responseObserver);
    }

    /**
     */
    public void updateCartTotal(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCartTotalMethod(), responseObserver);
    }

    /**
     */
    public void deleteFromCart(org.dataaccess.protobuf.CartItem request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFromCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.Cart,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_REGISTER_CART)))
          .addMethod(
            getRegisterCartItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.CartItem,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_REGISTER_CART_ITEM)))
          .addMethod(
            getFindCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Cart>(
                  this, METHODID_FIND_CART)))
          .addMethod(
            getGetAllFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.CartItems>(
                  this, METHODID_GET_ALL_FROM_CART)))
          .addMethod(
            getDeleteAllFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_DELETE_ALL_FROM_CART)))
          .addMethod(
            getUpdateCartTotalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_UPDATE_CART_TOTAL)))
          .addMethod(
            getDeleteFromCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.CartItem,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_DELETE_FROM_CART)))
          .build();
    }
  }

  /**
   */
  public static final class CartServiceStub extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerCart(org.dataaccess.protobuf.Cart request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerCartItem(org.dataaccess.protobuf.CartItem request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterCartItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Cart> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFromCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllFromCart(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllFromCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCartTotal(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCartTotalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFromCart(org.dataaccess.protobuf.CartItem request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dataaccess.protobuf.Void registerCart(org.dataaccess.protobuf.Cart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void registerCartItem(org.dataaccess.protobuf.CartItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterCartItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Cart findCart(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.CartItems getAllFromCart(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFromCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void deleteAllFromCart(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllFromCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void updateCartTotal(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCartTotalMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void deleteFromCart(org.dataaccess.protobuf.CartItem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFromCartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> registerCart(
        org.dataaccess.protobuf.Cart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> registerCartItem(
        org.dataaccess.protobuf.CartItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterCartItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Cart> findCart(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.CartItems> getAllFromCart(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFromCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> deleteAllFromCart(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllFromCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> updateCartTotal(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCartTotalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> deleteFromCart(
        org.dataaccess.protobuf.CartItem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_CART = 0;
  private static final int METHODID_REGISTER_CART_ITEM = 1;
  private static final int METHODID_FIND_CART = 2;
  private static final int METHODID_GET_ALL_FROM_CART = 3;
  private static final int METHODID_DELETE_ALL_FROM_CART = 4;
  private static final int METHODID_UPDATE_CART_TOTAL = 5;
  private static final int METHODID_DELETE_FROM_CART = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_CART:
          serviceImpl.registerCart((org.dataaccess.protobuf.Cart) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_REGISTER_CART_ITEM:
          serviceImpl.registerCartItem((org.dataaccess.protobuf.CartItem) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_FIND_CART:
          serviceImpl.findCart((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Cart>) responseObserver);
          break;
        case METHODID_GET_ALL_FROM_CART:
          serviceImpl.getAllFromCart((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.CartItems>) responseObserver);
          break;
        case METHODID_DELETE_ALL_FROM_CART:
          serviceImpl.deleteAllFromCart((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_UPDATE_CART_TOTAL:
          serviceImpl.updateCartTotal((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_DELETE_FROM_CART:
          serviceImpl.deleteFromCart((org.dataaccess.protobuf.CartItem) request,
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

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dataaccess.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getRegisterCartMethod())
              .addMethod(getRegisterCartItemMethod())
              .addMethod(getFindCartMethod())
              .addMethod(getGetAllFromCartMethod())
              .addMethod(getDeleteAllFromCartMethod())
              .addMethod(getUpdateCartTotalMethod())
              .addMethod(getDeleteFromCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
