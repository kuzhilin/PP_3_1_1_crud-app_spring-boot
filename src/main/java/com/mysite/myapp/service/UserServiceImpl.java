package com.mysite.myapp.service;

import com.mysite.myapp.dao.UserDao;
import com.mysite.myapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void save(User user) { userDao.save(user); }

    @Transactional
    @Override
    public void update(User user) { userDao.update(user); }

    @Transactional
    @Override
    public void delete(long id) {userDao.delete(id); }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
