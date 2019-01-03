package spingclouddemo.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Slf4j
@Configuration
public class RestConfig {


    @Bean(name="RestTemplate")
    public RestTemplate getRestTemplate(){
        RestTemplateBuilder restbuilder=new RestTemplateBuilder();
        RestTemplate build = restbuilder.build();
        return build;
    }





}
