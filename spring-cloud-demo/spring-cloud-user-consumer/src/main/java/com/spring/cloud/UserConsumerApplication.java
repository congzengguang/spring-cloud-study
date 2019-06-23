package com.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author czg
 * @date 2019/6/23
 */
@SpringBootApplication
public class UserConsumerApplication {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public static void main(String args[]){
        SpringApplication.run(UserConsumerApplication.class);
    }
}
