package com.assets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com.assets.*"})
@SpringBootApplication
public class AssetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetsApplication.class, args);
    }

}
