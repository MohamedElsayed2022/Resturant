package com.coding.resturant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
//@EntityScan("com/coding/resturant/model")
public class RestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }

}
