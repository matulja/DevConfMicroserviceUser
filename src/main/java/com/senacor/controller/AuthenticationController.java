package com.senacor.controller;

import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.service.TokenService;
import com.senacor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@RestController
@RequestMapping("/user")
public class AuthenticationController {

  @Autowired
  UserService userService;

    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity <Token> authenticateUser(@RequestParam(value = "username", required = false) String username,
                                                  @RequestParam(value = "password", required=false) String password) {
        System.out.println("in Login");

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        User savedUser = userService.authenticateUser(user);
        Token token = tokenService.createToken(savedUser);

        System.out.println("" + token);

        if(token!= null){
            return new ResponseEntity<>(token, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(token, HttpStatus.UNAUTHORIZED);
        }

    }
}
