package org.dataaccess.config;

import services.CartService;
import services.ProductService;
import services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig
{

    @Bean public UserService getUserService(){
        return new UserService();
    }

    @Bean public ProductService getProductService() {
        return new ProductService();
    }

    @Bean public CartService getCartService() {
        return new CartService();
    }
}
