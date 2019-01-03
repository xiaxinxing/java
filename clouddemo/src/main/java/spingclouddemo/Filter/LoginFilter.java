package spingclouddemo.Filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "enable", value = "true")})
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //requset的请求编码 和返回给浏览器的编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //添加响应参数 允许其他域名访问
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","POST");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String requestUri = request.getRequestURI();
        //if(requestUri.indexOf("/a")>0){


        //}else{
            doFilter(servletRequest,servletResponse,filterChain);
       // }
    }

    @Override
    public void destroy() {

    }
}
