package com.springboot.dao;


import com.springboot.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(long id);
    public void deleteUser(long id);

}
