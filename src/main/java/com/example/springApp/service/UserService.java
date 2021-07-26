package com.example.springApp.service;

import com.example.springApp.models.Role;
import com.example.springApp.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void edit(User user);

    void delete(long id);

    User getUserById(long id);

    List<User> listUsers();

}
