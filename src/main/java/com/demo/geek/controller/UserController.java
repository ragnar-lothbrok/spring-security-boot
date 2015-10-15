package com.demo.geek.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.geek.domain.User;
import com.demo.geek.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user", method=RequestMethod.GET)
    public @ResponseBody
    List<User> allUsers() {
        return userService.findAll();
    }


    @RequestMapping(value = "/user", method=RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

}