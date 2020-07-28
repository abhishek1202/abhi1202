package com.User.Info.Service;

import com.User.Info.Dao.UserRepository;
import com.User.Info.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImp implements UserService{


    private UserRepository userRepository;

    @Autowired
    public UserImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserImp()
    {

    }

    @Override
    public List<Users> getallUsers() {
        return userRepository.findAll();
    }

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public Users getUserById(int userId) {

        Optional<Users> results=userRepository.findById(userId);
        Users users= null;
        if (results.isPresent())
        {
            users=results.get();
        }
        else
        {
            throw new RuntimeException("Did not find userId - " + userId);
        }

        return users;
    }

    @Override
    public void deleteUser(int userId) {
         userRepository.deleteById(userId);
    }
}
