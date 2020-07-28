package com.User.Info.Rest;

import com.User.Info.Entity.Users;
import com.User.Info.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestCantroller {
    private UserService userService;

    @Autowired
    public UserRestCantroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<Users> findallUsers()
    {
        return userService.getallUsers();

    }

    @PostMapping("/users")
    public Users addUser(@RequestBody Users users)
    {
        users.setId(0);
        userService.save(users);
        return users;
    }
}
