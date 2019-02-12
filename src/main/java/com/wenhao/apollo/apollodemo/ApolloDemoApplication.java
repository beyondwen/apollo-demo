package com.wenhao.apollo.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
@SpringBootApplication
public class ApolloDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloDemoApplication.class, args);
    }

}

