package spingclouddemo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == 401){
            return "error";
        }else if(statusCode == 404){
            return "error";
        }else if(statusCode == 403){
            return "error";
        }else{
            return "error";
        }

    }


    @Override
    public String getErrorPath() {
        return "/error";
    }
}
