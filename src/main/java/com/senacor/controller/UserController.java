package com.senacor.controller;

import com.senacor.model.User;
import com.senacor.repository.UserRepository;
import com.senacor.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/auth", method = RequestMethod.POST,  produces = "application/json", consumes = "application/json")
    public User authenticateUser(@RequestBody User user) {
       return user = userService.authenticateUser(user);
       /* if(user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.UNAUTHORIZED);
        }*/
      //  return new ResponseEntity<User>(userService.authenticateUser(user), HttpStatus.OK);
    }
}
