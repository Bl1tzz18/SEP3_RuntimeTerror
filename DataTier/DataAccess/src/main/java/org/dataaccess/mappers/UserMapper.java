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
                .build();
    }
}
