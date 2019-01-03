package spingclouddemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping("/h5/{htmlname}")
    public String gethtml(@PathVariable("htmlname") String htmlname){
        return htmlname;
    }



}
