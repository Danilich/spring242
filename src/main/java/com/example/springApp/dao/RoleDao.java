package com.example.springApp.dao;

import com.example.springApp.models.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();

    Role getRole(long id);
}
