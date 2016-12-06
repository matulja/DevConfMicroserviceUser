package com.senacor.controller;

import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.service.TokenService;
import com.senacor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

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

        User user = new User(username, password);
        User savedUser = userService.authenticateUser(user);

        if(savedUser != null){
            Token token = tokenService.createToken(savedUser);
            return new ResponseEntity<>(token, HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

    }


    @RequestMapping(value = "/validateToken", method = RequestMethod.GET)
    public ResponseEntity<String> validateToken(@RequestParam(value = "tokenId", required = false) String tokenId){
        String savedTokenId = tokenService.checkToken(tokenId);
        return new ResponseEntity<>(savedTokenId, HttpStatus.OK);
    }

}
