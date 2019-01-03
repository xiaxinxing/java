package spingclouddemo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spingclouddemo.Utils.TemplateUtil;

@RestController
public class CloudController {

    @Autowired
    TemplateUtil Templatedao;



    public String cloudtest(){
         RestTemplate restTemplate = Templatedao.getRestTemplate();
        //return restTemplate.getForObject("http://client_demo/a/hi", String.class);
        return null;
    }

}
