package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    User getUser(long id);

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}
