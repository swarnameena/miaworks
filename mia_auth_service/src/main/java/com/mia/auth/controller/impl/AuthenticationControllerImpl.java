package com.mia.auth.controller.impl;

import com.mia.auth.controller.AuthenticationController;
import com.mia.auth.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class AuthenticationControllerImpl implements AuthenticationController {


    @Autowired
    AuthenticationService authenticationService;

    @Override
    public String showLoginPage(ModelMap model) {

        model.put("name", "in28Minutes");
        return "welcome";

    }
}
