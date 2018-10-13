package com.mia.auth.service.impl;


import com.mia.auth.dao.UserLoginDao;
import com.mia.auth.model.UserLogin;
import com.mia.auth.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

@Autowired
private UserLoginDao userLoginDao;

    @Override
    public Response<UserLogin> login(String userName, String password) {
        return null;
    }

    @Override
    public Response<UserLogin> signup(String userName, String password) {
        return null;
    }

    @Override
    public Response<UserLogin> resetPassword(String userName) {
        return null;
    }

    @Override
    public Response<UserLogin> forgotUserName(String phoneNumber) {
        return null;
    }
}
