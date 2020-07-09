package com.lcchain.mall.thirdparty.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ThirdpartyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdpartyProviderApplication.class, args);
    }

}
