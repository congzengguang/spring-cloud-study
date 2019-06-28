package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author czg
 * @date 2019/6/28
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGetWayZuulApplication {
    public static void main(String args[]){
        SpringApplication.run(ApiGetWayZuulApplication.class,args);
    }
}
