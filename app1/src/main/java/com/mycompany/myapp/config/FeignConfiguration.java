package com.mycompany.myapp.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!test")
@EnableFeignClients(basePackages = "com.mycompany.myapp")
public class FeignConfiguration {

}
