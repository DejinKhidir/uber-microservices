package com.uber.user_service.services;

import com.uber.user_service.entities.User;

import java.util.List;

public interface UserService {

    User getUserById (Long id);
    User createUser(User user);
    List<User> getAllUsers();
    User updateUser(Long id, User updatedUser);
    void deleteUser(Long id);
}
