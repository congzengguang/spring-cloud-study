package com.spring.cloud.controller;

import com.spring.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author czg
 * @date 2019/6/23
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return this.restTemplate.getForObject("http://localhost:8080/user/"+id,User.class);
    }
}
