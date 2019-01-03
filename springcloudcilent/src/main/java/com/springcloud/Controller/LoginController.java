package com.springcloud.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {



    @Autowired(required = false)
    DemoService demoService;

    @Autowired
    //@Qualifier("RestTemplate")
    private RestTemplate restdao;


    /**springcloud 服务调用实现其一
     * 访问   localhost:11002/login       及跳到    localhost:11001/a/mybatis
     *
     * */
    @RequestMapping("/login")
    public String doLogin(HttpServletRequest request){
         String body = demoService.hi("1");
        return body;
    }


    /**springcloud 服务调用实现其二
     *
     * 利用 spring boot自带的rest模板 也能访问 
     * */
    @RequestMapping("/ribbon")
    public String doribbontest(HttpServletRequest request){
        String url="http://clouddemo/a/mybatis";
        ResponseEntity<String> forEntity = restdao.getForEntity(url, String.class);
        String body = forEntity.getBody();
        return body;
    }



}
