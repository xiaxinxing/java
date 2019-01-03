package spingclouddemo.square.impl.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spingclouddemo.Annotation.demoservice;
import spingclouddemo.MybatisFile.dao.VwtSquareMapper;
import spingclouddemo.MybatisFile.example.VwtSquare;
import spingclouddemo.MybatisFile.example.VwtSquareExample;
import spingclouddemo.square.api.interfaces.Squareinterface;
import spingclouddemo.square.impl.dao.SquareDao;
import spingclouddemo.square.impl.entity.Square;

import java.util.*;

@demoservice
@Transactional(readOnly = false)
public class SquareService implements Squareinterface {

    /***s使用jdbcTemplate 模板操作原生 sql语句*/
    @Autowired
    @Qualifier("ttmoaJdbcTemplate")
    JdbcTemplate jdbcdao;

    @Autowired
    VwtSquareMapper squareMapper;



    // 这个dao是使用 第一个数据源配置的jpa
    @Autowired
    private SquareDao squareDao;

    @Override
    public Square findSquareById(String id) {
         Optional<Square> optional = squareDao.findById(id);
         Square square = optional.get();
         return square;
    }













    @Override
    public List<Square> findSquarePage(int pageindex, int pagenum) {
        Pageable pageable= PageRequest.of(pageindex,pagenum);
        Page<Square> all = squareDao.findAll(pageable);
        Iterator<Square> iterator = all.iterator();
        List<Square> squareList=new ArrayList<>();
        while(iterator.hasNext()){
            squareList.add(iterator.next());
        }
        return squareList;
    }

    @Override
    public Object findSquareByJdbc(String id) {
        List<Map<String, Object>> maps = jdbcdao.queryForList(" select * from vwt_square ");//select * from vwt_square;
        return maps;
    }

    @Override
    public String FindFirstSquare() {
        VwtSquareExample example=new VwtSquareExample();
        List<VwtSquare> vwtSquares = squareMapper.selectByExample(example);
        return vwtSquares.get(0).getName();
    }

    @Override
    public VwtSquare SelectSquare(String squarename, int type) {

        VwtSquare vwtSquare = squareMapper.selectSquare(squarename, type);
        return vwtSquare;
    }


}
