package com.senacor.controller;

import com.senacor.model.User;
import com.senacor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marynasuprun on 07.11.2016.
 */

@RestController
@RequestMapping("/user")
public class AuthenticationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/auth", method = RequestMethod.POST,  produces = "application/json", consumes = "application/json")
    public ResponseEntity <User> authenticateUser(@RequestBody User user) {

        System.out.println("in Login");
        User loginUser = userService.authenticateUser(user);

        if(loginUser != null){
            return new ResponseEntity<>(loginUser, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(loginUser, HttpStatus.UNAUTHORIZED);
        }


       /* if(user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.UNAUTHORIZED);
        }*/
      //  return new ResponseEntity<User>(userService.authenticateUser(user), HttpStatus.OK);
    }
}
