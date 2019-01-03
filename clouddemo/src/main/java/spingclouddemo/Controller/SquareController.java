package spingclouddemo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import spingclouddemo.MybatisFile.dao.VwtSquareMapper;
import spingclouddemo.MybatisFile.example.VwtSquare;
import spingclouddemo.MybatisFile.example.VwtSquareExample;
import spingclouddemo.Utils.TemplateUtil;
import spingclouddemo.Utils.redis.RedisUtil;
import spingclouddemo.square.api.interfaces.Squareinterface;
import spingclouddemo.square.impl.entity.Square;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/a")
public class SquareController {

    private Logger logger= LoggerFactory.getLogger(SquareController.class);

    @Autowired
    private Squareinterface squareinterface;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    TemplateUtil Templatedao;




    @RequestMapping("/square")
    public Object RedisTest(HttpServletRequest request){
        String id=request.getParameter("id");
        logger.info("获取到的id为:"+id);
        //Square squareById = squareinterface.findSquareById(id);
        //logger.info(squareById.toString());

        Object squareByJdbc = squareinterface.findSquareByJdbc(id);
        redisUtil.set("id",id);
        logger.info(redisUtil.get("id"));



        return squareByJdbc;
    }

    @RequestMapping("/page")
    public List<Square> SquareSort(HttpServletRequest request){
        int pageindex=1;
        int pagenum=2;
        List<Square> squarePage = squareinterface.findSquarePage(pageindex, pagenum);
        return  squarePage;
    }

    @RequestMapping("/mybatis")
    public String mybatis(HttpServletRequest request){
        String id = request.getParameter("id");
        //String s = squareinterface.FindFirstSquare();
        VwtSquare s = squareinterface.SelectSquare("文件管理", 2);
        return  s.getName();
    }

    @RequestMapping("/rest")
    public String restGet(HttpServletRequest request){
        RestTemplate rest = Templatedao.getRestTemplate();
        ResponseEntity<String> forEntity = rest.getForEntity("http://127.0.0.1:11001/a/mybatis", String.class);
        System.out.println(forEntity.getBody());
        return  forEntity.getBody();
    }










}
