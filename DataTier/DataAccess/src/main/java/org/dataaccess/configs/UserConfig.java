package org.dataaccess.configs;

import org.dataaccess.Shared.User;
import org.dataaccess.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig
{
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository repository)
    {
        return args -> {
            User admin = new User(
                    "admin",
                    "password",
                    "admin"
            );

            repository.save(admin);
        };
    }
}
