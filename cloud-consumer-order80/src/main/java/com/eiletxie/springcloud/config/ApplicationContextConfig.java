package com.eiletxie.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig { //config配置类

    @Bean //用注解的方式依赖注入
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
