package com.neuedu.service;

import com.neuedu.pojo.User;

import java.util.List;

public interface LoginService {
    List<User> getUser(User user);
}
