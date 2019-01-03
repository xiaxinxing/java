package com.springcloud.Controller;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "clouddemo" ,path="/a") //这里的name对应调用服务的spring.applicatoin.name
public interface DemoService {



        /**这表明 我调用 applicationname=clouddemo 的 （必须在同一个服务端注册的） /a/mybatis 方法*/
        @RequestMapping(value = "/mybatis")
        String hi(@RequestParam("id") String id);

}
