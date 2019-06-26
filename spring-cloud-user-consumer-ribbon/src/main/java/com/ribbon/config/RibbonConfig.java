package com.ribbon.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.discovery.converters.Auto;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author czg
 * @date 2019/6/26
 */
@Configuration
public class RibbonConfig {
    @Autowired
    private IClientConfig config;
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}
