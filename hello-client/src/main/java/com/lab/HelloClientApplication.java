package com.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author chenrong
 * @Date 2019-09-24 16:36
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class HelloClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloClientApplication.class, args);
    }
}

@Configuration
class Config{

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
