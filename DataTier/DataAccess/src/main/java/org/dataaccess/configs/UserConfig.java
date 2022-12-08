package org.dataaccess.configs;

import org.dataaccess.Shared.Address;
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
            Address address = new Address();
            User admin = new User();

            admin.setUsername("admin");
            admin.setPassword("password");
            admin.setF_name("");
            admin.setL_name("");
            admin.setType("admin");
            admin.setPhone("");
            admin.setAddress(address);



            repository.save(admin);
        };
    }
}
