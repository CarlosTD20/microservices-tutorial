package com.ccsw.tutorial_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TutorialGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorialGatewayApplication.class, args);
    }

}
