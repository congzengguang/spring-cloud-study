package com.spring.cloud.controller;

import com.netflix.discovery.EurekaClient;
import com.spring.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author czg
 * @date 2019/6/23
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
//    @Autowired
//    private EurekaClient eurekaClient;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        //InstanceInfo info = eurekaClient.getNextServerFromEureka("USER-SERVICE",false);

        return this.restTemplate.getForObject("http://USER-SERVICE/user/"+id,User.class);
    }


    @GetMapping("/test")
    public String test(){
        //InstanceInfo info = eurekaClient.getNextServerFromEureka("USER-SERVICE",false);
        ServiceInstance serviceInstance= loadBalancerClient.choose("USER-SERVICE");
        System.out.println(serviceInstance.getPort()+"服务名："+serviceInstance.getServiceId());
        return UUID.randomUUID().toString();
    }
}
