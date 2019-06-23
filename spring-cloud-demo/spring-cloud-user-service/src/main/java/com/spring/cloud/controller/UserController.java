package com.spring.cloud.controller;

import com.spring.cloud.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czg
 * @date 2019/6/23
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }
}
