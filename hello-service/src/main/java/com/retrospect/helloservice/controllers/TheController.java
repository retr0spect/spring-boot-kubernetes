package com.retrospect.helloservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aditya on 7/26/2018.
 */

@RestController
public class TheController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloSpring() {
        return "Hello Spring Boot";
    }

    @RequestMapping(value = "/second-service", method = RequestMethod.GET)
    public String secondService() {
        return "Hello Spring Boot";
    }


}
