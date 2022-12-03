package services;

import io.grpc.stub.StreamObserver;
import org.dataaccess.DAOInterfaces.ProductDAO;
import org.dataaccess.mappers.CategoryMapper;
import org.dataaccess.mappers.ProductMapper;
import org.dataaccess.protobuf.*;
import org.dataaccess.protobuf.Void;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase
{
    @Autowired
    private ProductDAO productDAO;

    public ProductService() {
    }

    @Override
    public void registerProduct(Product request, StreamObserver<Product> responseObserver)
    {
        org.dataaccess.Shared.Product product = new org.dataaccess.Shared.Product(
                request.getName(),
                request.getImgPath(),
                request.getPrice(),
                request.getDescription(),
                request.getInStock(),
                CategoryMapper.mapToShared(request.getCategory())
        );

        org.dataaccess.Shared.Category category = productDAO.getCategory(request.getCategory().getCategoryName());
        if (category != null)
            product.setCategory(category);

        org.dataaccess.Shared.Product registerProduct = productDAO.registerProduct(product);

        responseObserver.onNext(ProductMapper.mapToProto(registerProduct));
        responseObserver.onCompleted();
    }

    @Override
    public void getProducts(Void request, StreamObserver<ProductItems> responseObserver)
    {
        Collection<org.dataaccess.Shared.Product> products = productDAO.getProducts();

        Collection<Product> productCollection = new ArrayList<>();

        for (var product: products)
        {
           productCollection.add(ProductMapper.mapToProto(product));
        }

        ProductItems productItems = ProductItems.newBuilder().addAllProduct(productCollection).build();

        responseObserver.onNext(productItems);
        responseObserver.onCompleted();
    }

    @Override
    public void getProductsInCartByUser(SearchField request, StreamObserver<ProductItems> responseObserver)
    {
        Collection<org.dataaccess.Shared.Product> products = productDAO.getAllProductFromCartByUsername(request.getSearch());

        if (products.isEmpty()) {
            responseObserver.onError(new Exception("No products in cart"));
            return;
        }

        Collection<Product> productCollection = new ArrayList<>();

        for (var product : products)
        {
            productCollection.add(ProductMapper.mapToProto(product));
        }

        ProductItems productItems = ProductItems.newBuilder().addAllProduct(productCollection).build();

        responseObserver.onNext(productItems);
        responseObserver.onCompleted();
    }

    @Override
    public void findProduct(SearchField request, StreamObserver<Product> responseObserver)
    {
        org.dataaccess.Shared.Product product = productDAO.findProduct(request.getSearch());

        if (product==null) {
            responseObserver.onError(new Exception("Product does not exist"));
            return;
        }

        responseObserver.onNext(ProductMapper.mapToProto(product));
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void deleteProduct(SearchField request, StreamObserver<Void> responseObserver)
    {
        productDAO.deleteProduct(request.getSearch());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Transactional
    @Override
    public void updateProduct(Product request, StreamObserver<Void> responseObserver)
    {
        org.dataaccess.Shared.Product product = new org.dataaccess.Shared.Product(
                request.getId(),
                request.getName(),
                request.getImgPath(),
                request.getPrice(),
                request.getDescription(),
                request.getInStock(),
                CategoryMapper.mapToShared(request.getCategory())
        );

        productDAO.updateProduct(product);

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
