package com.springcloudserver.springcloudserver;


//import de.codecentric.boot.admin.server.config.AdminServerProperties;
//import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;


/***注意 springcloud是基于 springboot的    访问地址 ip+port*/


@EnableEurekaServer
@SpringBootApplication
public class SpringcloudserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudserverApplication.class, args);
    }
}

