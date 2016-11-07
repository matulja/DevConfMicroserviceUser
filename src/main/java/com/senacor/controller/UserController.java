package com.senacor.controller;

import com.senacor.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marynasuprun on 07.11.2016.
 */
public class UserController {

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User("23", "Berlina", "Berlin"));

        return "registration";
    }
}
