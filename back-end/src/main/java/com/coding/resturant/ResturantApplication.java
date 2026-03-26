package com.coding.resturant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("model")
public class ResturantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResturantApplication.class, args);
    }

}
