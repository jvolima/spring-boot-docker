package com.jvolima.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seed implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User user1 = new User();
            user1.setName("João Vitor");

            User user2 = new User();
            user2.setName("Giovani Ocan");

            userRepository.save(user1);
            userRepository.save(user2);
        }
    }
}
