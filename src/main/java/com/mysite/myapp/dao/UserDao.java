package com.mysite.myapp.dao;

import com.mysite.myapp.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User user);

    void delete(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
