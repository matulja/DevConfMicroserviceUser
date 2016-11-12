package com.senacor.service;

import com.senacor.model.User;
import com.senacor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by saba on 11.11.16.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean authenticateUser(User user) {

        boolean isAuthenticated = false;
        if (user != null) {
            if (!StringUtils.isEmpty(user.getLoginName())
                    && !StringUtils.isEmpty(user.getPassword())) {
                String loginName = user.getLoginName();
                String password = user.getPassword();
                User savedUser = userRepository.findByLoginName(user.getLoginName());
                if (savedUser != null && savedUser.getPassword().equals(user.getPassword())) {
                    isAuthenticated = true;
                }
            }
        }

        return isAuthenticated;

    }
}
