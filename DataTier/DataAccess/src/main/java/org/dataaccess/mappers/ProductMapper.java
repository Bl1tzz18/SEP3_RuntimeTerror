package org.dataaccess.mappers;

import org.dataaccess.protobuf.Product;

public abstract class ProductMapper
{
    public static Product mapToProto(org.dataaccess.Shared.Product product)
    {
        return Product.newBuilder()
                .setId(product.getId())
                .setName(product.getName())
                .setImgPath(product.getImgPath())
                .setPrice(product.getPrice())
                .setDescription(product.getDescription())
                .setCategory(CategoryMapper.mapToProto(product.getCategory()))
                .setInStock(product.isInStock())
                .build();
    }
}
