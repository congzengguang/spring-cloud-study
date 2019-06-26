package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author czg
 * @date 2019/6/23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHaPeerOneApplication {
    public static void main(String args[]){
        SpringApplication.run(EurekaServerHaPeerOneApplication.class);
    }
}
