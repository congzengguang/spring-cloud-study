package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author czg
 * @date 2019/6/23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //启用熔断
public class UserConsumerHystrixApplication {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String args[]){
        SpringApplication.run(UserConsumerHystrixApplication.class);
    }
}
