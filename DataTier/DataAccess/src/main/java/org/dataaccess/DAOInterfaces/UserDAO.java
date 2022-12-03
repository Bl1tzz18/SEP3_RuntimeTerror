package org.dataaccess.DAOInterfaces;

import org.dataaccess.Shared.User;

public interface UserDAO
{
    User registerUser(User user);

    User loginUser(User user);

    User findUser(String username);

    void addCredits(int credits, String userName);

    void removeCredits(int credits, String userName);
}
