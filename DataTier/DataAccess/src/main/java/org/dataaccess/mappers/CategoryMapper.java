package org.dataaccess.mappers;

import org.dataaccess.protobuf.Category;

public abstract class CategoryMapper
{
    public static Category mapToProto(org.dataaccess.Shared.Category category)
    {
        return Category.newBuilder()
                .setCategoryName(category.getCategory_name())
                .build();
    }

    public static org.dataaccess.Shared.Category mapToShared(Category category)
    {
        return new org.dataaccess.Shared.Category(
                category.getCategoryName()
        );
    }
}
