package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;


public interface RoleService {
    List<Role> getAllRoles();


    Role findRoleById(long id);


    void saveRole(Role role);


    void updateUser(Role role, long id);


    void deleteRole(long id);
}