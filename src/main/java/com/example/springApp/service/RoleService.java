package com.example.springApp.service;

import com.example.springApp.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(long id);
}
