package com.wbg.springxmlbean.service.impl;

import com.wbg.springxmlbean.entity.User;
import com.wbg.springxmlbean.service.UserService;

public class UserServiceImpl implements UserService {

    private User user;
    @Override
    public User getUser() {
        return user;
    }
    @Override
    public void setUser(User user){
        this.user=user;
    }
}
