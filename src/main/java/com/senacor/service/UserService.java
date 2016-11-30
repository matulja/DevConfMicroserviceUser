package com.senacor.service;

import com.senacor.model.User;
import com.senacor.repository.TokenRepository;
import com.senacor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by saba on 11.11.16.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    TokenRepository tokenRepository;

    public User authenticateUser(User user) {


        User savedUser = userRepository.findByUsername(user.getUsername());
        System.out.println(savedUser.getUsername());
        if (savedUser != null && savedUser.getPassword().equals(user.getPassword())) {
            user = savedUser;

        }
        else{
            user = null;
        }

        return user;

    }
}
