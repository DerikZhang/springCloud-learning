package com.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jim.huang on 2017/2/28.
 * @SpringBootApplication is consist of @Configuration, @EnableAutoConfiguration, @ComponentScan
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //alter tomcat listening port: add parameter to main : —server.port=8081
        SpringApplication.run(Main.class, args);
    }
}
