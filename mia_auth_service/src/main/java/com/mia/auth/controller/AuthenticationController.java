package com.mia.auth.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public interface AuthenticationController {

        @RequestMapping(value = "/", method = RequestMethod.GET)
        String showLoginPage(ModelMap model) ;


}
