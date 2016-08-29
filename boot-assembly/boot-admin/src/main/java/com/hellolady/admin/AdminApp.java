package com.hellolady.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hk on 6/19/16.
 */
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableAdminServer
public class AdminApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class, args);
    }
    @Override
    public void run(String... strings) throws Exception {

    }
}
