package com.hellolady.eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by hk on 6/15/16.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class EurekaApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
