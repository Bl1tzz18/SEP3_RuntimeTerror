using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace Application.Logic;

public class UserLogic : IUserLogic
{

    private readonly IUserDAO userDao;
    private readonly ICartDAO cartDao;

    public UserLogic(IUserDAO userDao, ICartDAO cartDao)
    {
        this.userDao = userDao;
        this.cartDao = cartDao;
    }
    
    public async Task<User> CreateUserAsync(UserCreationDTO userCreationDto)
    {
        string userName = userCreationDto.userName;

        var checkUser = await userDao.FindUserAsync(userName);

        if (checkUser != null)
            throw new Exception("Username already exists");
        
        ValidateData(userCreationDto);

        var user = new User
        {
            userName = userCreationDto.userName,
            password = userCreationDto.password,
            FirstName = userCreationDto.FirstName,
            LastName = userCreationDto.LastName
        };

        var cart = new Cart
        {
            UserName = userCreationDto.userName
        };

        User userToSend = await userDao.CreateUserAsync(user);
        
        await cartDao.RegisterCartAsync(cart);

        return userToSend;
    }

    public async Task<User> LoginUserAsync(UserLoginDTO userLoginDto)
    {
        string userName = userLoginDto.Username;
        string password = userLoginDto.Password;

        var user = await userDao.FindUserAsync(userName);

        if (user == null)
            throw new Exception("User does not exist");

        if (!password.Equals(user.password))
        {
            throw new Exception("Incorrect username or password");
        }

        return await userDao.LoginUserAsync(user);
    }

    public async Task AddCreditsAsync(int credits, string username)
    {
        if (userDao.FindUserAsync(username).Equals(null))
        {
            throw new Exception($"The user {username} does not exits");
        }

        await userDao.AddCreditsAsync(credits, username);
    }

    public async Task RemoveCreditsAsync(int credits, string username)
    {
        if (userDao.FindUserAsync(username).Equals(null))
        {
            throw new Exception($"The user {username} does not exits");
        }

        await userDao.RemoveCreditsAsync(credits, username);
    }

    private static void ValidateData(UserCreationDTO user)
    {
        string username = user.userName;

        if (username.Length > 20 || username.Length < 5)
        {
            throw new Exception("Username must have more than 5 characters and less than 21");
        }
    }
}