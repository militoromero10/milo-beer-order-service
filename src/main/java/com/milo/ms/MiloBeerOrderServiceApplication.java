package com.milo.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;

@SpringBootApplication
public class MiloBeerOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiloBeerOrderServiceApplication.class, args);
    }

}
