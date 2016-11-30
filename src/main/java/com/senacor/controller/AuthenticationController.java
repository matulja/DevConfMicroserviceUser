package com.senacor.controller;

import com.senacor.model.User;
import com.senacor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@RestController
@RequestMapping("/user")
public class AuthenticationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity <User> authenticateUser(@RequestParam(value = "username", required = false) String username,
                                                  @RequestParam(value = "password", required=false) String password) {
        System.out.println("in Login");

        User user = new User(username, password);
        User loginUser = userService.authenticateUser(user);

        if(loginUser != null){
            return new ResponseEntity<>(loginUser, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(loginUser, HttpStatus.UNAUTHORIZED);
        }

    }
}
