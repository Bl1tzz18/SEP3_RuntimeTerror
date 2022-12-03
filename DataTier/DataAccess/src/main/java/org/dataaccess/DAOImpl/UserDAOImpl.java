package org.dataaccess.DAOImpl;

import org.dataaccess.DAOInterfaces.UserDAO;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.CartRepository;
import org.dataaccess.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDAOImpl implements UserDAO
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    public UserDAOImpl()
    {
    }

    @Override
    public User registerUser(User user)
    {
        user.setCredits(0);
        user.setType("customer");

        userRepository.save(user);

        return user;
    }

    @Override
    public User loginUser(User user)
    {
        User checkUser = userRepository.findUser(user.getUsername());
        if (checkUser != null)
            return userRepository.findUser(user.getUsername());

        return null;
    }

    @Override
    public User findUser(String username)
    {
        User checkUser = userRepository.findUser(username);
        if (checkUser!= null)
            return userRepository.findUser(username);

        return null;
    }

    @Override
    public void addCredits(int credits, String userName)
    {
        User findUser = userRepository.findUser(userName);
        if (findUser!= null)
            userRepository.changeCredits(findUser.getCredits()+credits, findUser.getUsername());
    }

    @Override
    public void removeCredits(int credits, String userName) {
        User findUser = userRepository.findUser(userName);
        if (findUser!= null)
            userRepository.changeCredits(findUser.getCredits()-credits, findUser.getUsername());
    }
}
