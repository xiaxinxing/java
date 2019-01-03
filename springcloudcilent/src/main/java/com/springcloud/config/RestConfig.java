package com.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Configuration
public class RestConfig {
    /**
     * @LoadBalanced实现负载均衡 必须要加
     * */
    @LoadBalanced
    @Bean(name="RestTemplate")
    public RestTemplate getRestTemplate(){
        RestTemplateBuilder restbuilder=new RestTemplateBuilder();
        RestTemplate build = restbuilder.build();
        return build;
    }





}
