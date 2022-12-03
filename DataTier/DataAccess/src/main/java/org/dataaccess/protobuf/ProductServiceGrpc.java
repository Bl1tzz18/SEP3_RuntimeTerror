package org.dataaccess.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: protobuf.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product,
      org.dataaccess.protobuf.Product> getRegisterProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterProduct",
      requestType = org.dataaccess.protobuf.Product.class,
      responseType = org.dataaccess.protobuf.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product,
      org.dataaccess.protobuf.Product> getRegisterProductMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product, org.dataaccess.protobuf.Product> getRegisterProductMethod;
    if ((getRegisterProductMethod = ProductServiceGrpc.getRegisterProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getRegisterProductMethod = ProductServiceGrpc.getRegisterProductMethod) == null) {
          ProductServiceGrpc.getRegisterProductMethod = getRegisterProductMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.Product, org.dataaccess.protobuf.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("RegisterProduct"))
              .build();
        }
      }
    }
    return getRegisterProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.Void,
      org.dataaccess.protobuf.ProductItems> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = org.dataaccess.protobuf.Void.class,
      responseType = org.dataaccess.protobuf.ProductItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.Void,
      org.dataaccess.protobuf.ProductItems> getGetProductsMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.Void, org.dataaccess.protobuf.ProductItems> getGetProductsMethod;
    if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
          ProductServiceGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.Void, org.dataaccess.protobuf.ProductItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.ProductItems.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.ProductItems> getGetProductsInCartByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsInCartByUser",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.ProductItems.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.ProductItems> getGetProductsInCartByUserMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.ProductItems> getGetProductsInCartByUserMethod;
    if ((getGetProductsInCartByUserMethod = ProductServiceGrpc.getGetProductsInCartByUserMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsInCartByUserMethod = ProductServiceGrpc.getGetProductsInCartByUserMethod) == null) {
          ProductServiceGrpc.getGetProductsInCartByUserMethod = getGetProductsInCartByUserMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.ProductItems>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsInCartByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.ProductItems.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductsInCartByUser"))
              .build();
        }
      }
    }
    return getGetProductsInCartByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Product> getFindProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindProduct",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Product> getFindProductMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Product> getFindProductMethod;
    if ((getFindProductMethod = ProductServiceGrpc.getFindProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getFindProductMethod = ProductServiceGrpc.getFindProductMethod) == null) {
          ProductServiceGrpc.getFindProductMethod = getFindProductMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Product.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("FindProduct"))
              .build();
        }
      }
    }
    return getFindProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product,
      org.dataaccess.protobuf.Void> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = org.dataaccess.protobuf.Product.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product,
      org.dataaccess.protobuf.Void> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.Product, org.dataaccess.protobuf.Void> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
          ProductServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.Product, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = org.dataaccess.protobuf.SearchField.class,
      responseType = org.dataaccess.protobuf.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField,
      org.dataaccess.protobuf.Void> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
          ProductServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<org.dataaccess.protobuf.SearchField, org.dataaccess.protobuf.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.SearchField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dataaccess.protobuf.Void.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerProduct(org.dataaccess.protobuf.Product request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterProductMethod(), responseObserver);
    }

    /**
     */
    public void getProducts(org.dataaccess.protobuf.Void request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     */
    public void getProductsInCartByUser(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsInCartByUserMethod(), responseObserver);
    }

    /**
     */
    public void findProduct(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(org.dataaccess.protobuf.Product request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.Product,
                org.dataaccess.protobuf.Product>(
                  this, METHODID_REGISTER_PRODUCT)))
          .addMethod(
            getGetProductsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.Void,
                org.dataaccess.protobuf.ProductItems>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            getGetProductsInCartByUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.ProductItems>(
                  this, METHODID_GET_PRODUCTS_IN_CART_BY_USER)))
          .addMethod(
            getFindProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Product>(
                  this, METHODID_FIND_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.Product,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.dataaccess.protobuf.SearchField,
                org.dataaccess.protobuf.Void>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerProduct(org.dataaccess.protobuf.Product request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProducts(org.dataaccess.protobuf.Void request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsInCartByUser(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsInCartByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findProduct(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(org.dataaccess.protobuf.Product request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(org.dataaccess.protobuf.SearchField request,
        io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dataaccess.protobuf.Product registerProduct(org.dataaccess.protobuf.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.ProductItems getProducts(org.dataaccess.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.ProductItems getProductsInCartByUser(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsInCartByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Product findProduct(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void updateProduct(org.dataaccess.protobuf.Product request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dataaccess.protobuf.Void deleteProduct(org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Product> registerProduct(
        org.dataaccess.protobuf.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.ProductItems> getProducts(
        org.dataaccess.protobuf.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.ProductItems> getProductsInCartByUser(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsInCartByUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Product> findProduct(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> updateProduct(
        org.dataaccess.protobuf.Product request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dataaccess.protobuf.Void> deleteProduct(
        org.dataaccess.protobuf.SearchField request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS = 1;
  private static final int METHODID_GET_PRODUCTS_IN_CART_BY_USER = 2;
  private static final int METHODID_FIND_PRODUCT = 3;
  private static final int METHODID_UPDATE_PRODUCT = 4;
  private static final int METHODID_DELETE_PRODUCT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PRODUCT:
          serviceImpl.registerProduct((org.dataaccess.protobuf.Product) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((org.dataaccess.protobuf.Void) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_IN_CART_BY_USER:
          serviceImpl.getProductsInCartByUser((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.ProductItems>) responseObserver);
          break;
        case METHODID_FIND_PRODUCT:
          serviceImpl.findProduct((org.dataaccess.protobuf.SearchField) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Product>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((org.dataaccess.protobuf.Product) request,
              (io.grpc.stub.StreamObserver<org.dataaccess.protobuf.Void>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((org.dataaccess.protobuf.SearchField) request,
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dataaccess.protobuf.Protobuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getRegisterProductMethod())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetProductsInCartByUserMethod())
              .addMethod(getFindProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
