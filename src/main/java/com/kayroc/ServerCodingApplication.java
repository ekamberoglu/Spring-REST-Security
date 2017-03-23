package com.kayroc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication(scanBasePackages={"com.kayroc"})
@EnableResourceServer
public class ServerCodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerCodingApplication.class, args);
    }
}
