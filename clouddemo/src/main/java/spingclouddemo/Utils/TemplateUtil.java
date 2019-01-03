package spingclouddemo.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**模板的一些实现类*/
@Component
public class TemplateUtil {


    /***s使用jdbcTemplate 模板操作原生 sql语句*/
    @Autowired
    @Qualifier("ttmoaJdbcTemplate")
    private  JdbcTemplate jdbcdao;


    /**spring 带的rest的模板*/
    //@LoadBalanced
    @Autowired
    @Qualifier("RestTemplate")
    private RestTemplate restdao;


    public  JdbcTemplate getJdbcTemplate(){
        return jdbcdao;
    }

    public RestTemplate getRestTemplate(){
        return restdao;
    }


}
