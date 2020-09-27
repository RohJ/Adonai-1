package com.adonai.dbupdate.service;

import com.adonai.dbupdate.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
