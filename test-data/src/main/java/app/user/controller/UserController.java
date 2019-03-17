package app.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.user.own.User;
import app.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/default")
    public User getUser(){
        return userService.getDefaultUser();
    }

    @GetMapping("/getMaxAge")
    public Integer getMaxAge(){
        return userService.getMaxAge();
    }

}
