package spingclouddemo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;



@EnableEurekaClient  //注册到springcloud服务端
@SpringBootApplication
//@EnableFeignClients             //调用springcloud微服务
//开启定时器注解
@EnableScheduling
public class ClouddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClouddemoApplication.class, args);
    }

}