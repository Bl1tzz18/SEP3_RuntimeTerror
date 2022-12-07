package org.dataaccess.mappers;

import org.dataaccess.protobuf.User;

public abstract class UserMapper
{
    public static User mapProto(org.dataaccess.Shared.User user)
    {
        return User.newBuilder()
                .setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .setFName(user.getF_name())
                .setLName(user.getL_name())
                .setCredits(user.getCredits())
                .setType(user.getType())
                .setPhone(user.getPhone())
                .setAddress(AddressMapper.mapToProto(user.getAddress()))
                .build();
    }

    public static org.dataaccess.Shared.User mapToShared(User user)
    {
        return new org.dataaccess.Shared.User(
                user.getUsername(),
                user.getPassword(),
                user.getFName(),
                user.getLName(),
                user.getCredits(),
                user.getType(),
                user.getPhone(),
                AddressMapper.mapToShared(user.getAddress())
        );
    }
}
