package com.jukusoft.os.pm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.jukusoft.os.pm")
public class Application extends SpringBootServletInitializer {

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
