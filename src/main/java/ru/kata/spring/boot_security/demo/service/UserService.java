package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User findUserByUsername(String username);

    User findUserById(long id);


    void saveUser(User user);


    void updateUser(User user, long id);


    boolean deleteUser(long id);
}
