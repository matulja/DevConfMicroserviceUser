package com.senacor.controller;

import com.senacor.model.NaturalPerson;
import com.senacor.model.Token;
import com.senacor.model.User;
import com.senacor.service.NaturalPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by saba on 09.01.17.
 */

@RestController
@RequestMapping("/naturalPerson")
public class AttendeeController {

    NaturalPersonService naturalPersonService;

    @Autowired
    public AttendeeController(NaturalPersonService naturalPersonService) {
        this.naturalPersonService = naturalPersonService;
    }


    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public NaturalPerson getNaturalPersonByUserId(@PathVariable("userId") String userId) {

        return naturalPersonService.getNaturalPerson(userId);
    }

    }
