package com.example.springApp.dao;

import com.example.springApp.models.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserDao {
    void add(User user);

    void edit(User user);

    void delete(long id);

    User getUserById(long id);

    List<User> listUsers();

    UserDetails getUserByName(String s);
}
