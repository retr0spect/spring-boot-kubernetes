package com.retrospect.orderprocessorapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aditya on 7/26/2018.
 */

@RestController
public class ProcessOrderController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloSpring() {
        return "This is coming from second service";
    }


}
