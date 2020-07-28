package com.User.Info.Service;

import com.User.Info.Entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getallUsers();
    public void save(Users users);
    public Users getUserById(int userId);
    public void deleteUser(int userId);
}
