package com.bdg.bdgebay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:repository.properties")
public class BdgEbayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdgEbayApplication.class, args);
    }

}
