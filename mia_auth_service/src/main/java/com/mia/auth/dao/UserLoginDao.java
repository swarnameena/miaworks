package com.mia.auth.dao;

import com.mia.auth.model.UserLogin;
import org.springframework.stereotype.Component;

import javax.xml.ws.Response;

public interface UserLoginDao {

    Response<UserLogin>  login(String userName, String password);
    Response<UserLogin> signup(String userName, String password);
    Response<UserLogin>  resetPassword(String userName, String password);
    Response<UserLogin>  forgotUserName(String phoneNumber);
}
