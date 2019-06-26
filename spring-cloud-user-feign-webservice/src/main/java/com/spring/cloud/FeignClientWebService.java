package com.spring.cloud;

import com.spring.cloud.model.User;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author czg
 * @date 2019/6/26
 */
@FeignClient("USER-SERVICE")
public interface FeignClientWebService {
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Long id);
}
