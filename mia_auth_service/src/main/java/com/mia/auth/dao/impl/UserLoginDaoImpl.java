package com.mia.auth.dao.impl;

import com.mia.auth.dao.UserLoginDao;
import com.mia.auth.model.UserLogin;

import javax.xml.ws.Response;

public class UserLoginDaoImpl implements UserLoginDao {
    @Override
    public Response<UserLogin> login(String userName, String password) {
        return null;
    }

    @Override
    public Response<UserLogin> signup(String userName, String password) {
        return null;
    }

    @Override
    public Response<UserLogin> resetPassword(String userName, String password) {
        return null;
    }

    @Override
    public Response<UserLogin> forgotUserName(String phoneNumber) {
        return null;
    }
}
