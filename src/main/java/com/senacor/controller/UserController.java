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

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ResponseEntity<HttpStatus> authenticateUser(@RequestBody User user) {
        if(userService.authenticateUser(user)) {
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        } else {
            return new ResponseEntity<HttpStatus>(HttpStatus.UNAUTHORIZED);
        }

    }
}
