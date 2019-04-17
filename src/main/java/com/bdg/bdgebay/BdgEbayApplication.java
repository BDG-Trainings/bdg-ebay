package com.bdg.bdgebay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:database-connection.properties")
public class BdgEbayApplication implements CommandLineRunner{

    @Autowired
    private RandomIntGenerator randomIntGenerator;

    public static void main(String[] args) {
        SpringApplication.run(BdgEbayApplication.class, args);


    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("NUMBER : " + randomIntGenerator.getNumber());
    }
}
