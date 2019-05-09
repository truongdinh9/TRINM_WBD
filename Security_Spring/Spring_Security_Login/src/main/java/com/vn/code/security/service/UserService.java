package com.vn.code.security.service;

import com.vn.code.security.model.User;

public interface UserService {

    public User findUserByEmail(String userName);

    public void saveUser(User user);
}
