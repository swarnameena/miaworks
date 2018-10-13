package com.mia.auth.service;

import com.mia.auth.model.UserLogin;

import javax.xml.ws.Response;

public interface AuthenticationService {
    Response<UserLogin> login(String userName, String password);
    Response<UserLogin> signup(String userName, String password);
    Response<UserLogin> resetPassword(String userName);
    Response<UserLogin> forgotUserName(String phoneNumber);

}
