package com.adonai.dbupdate.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
