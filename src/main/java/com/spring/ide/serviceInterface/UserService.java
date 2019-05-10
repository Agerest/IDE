package com.spring.ide.serviceInterface;


import com.spring.ide.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}