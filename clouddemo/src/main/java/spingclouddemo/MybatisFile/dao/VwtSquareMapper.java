package spingclouddemo.MybatisFile.dao;

import org.apache.ibatis.annotations.Param;
import spingclouddemo.MybatisFile.example.VwtSquare;
import spingclouddemo.MybatisFile.example.VwtSquareExample;

import java.util.List;

public interface VwtSquareMapper {
    long countByExample(VwtSquareExample example);

    int deleteByExample(VwtSquareExample example);

    int deleteByPrimaryKey(String id);

    int insert(VwtSquare record);

    int insertSelective(VwtSquare record);

    List<VwtSquare> selectByExample(VwtSquareExample example);

    VwtSquare selectByPrimaryKey(String id);

    VwtSquare selectSquare(@Param("squarename")String squarename,@Param("type")int type);

    int updateByExampleSelective(@Param("record") VwtSquare record, @Param("example") VwtSquareExample example);

    int updateByExample(@Param("record") VwtSquare record, @Param("example") VwtSquareExample example);

    int updateByPrimaryKeySelective(VwtSquare record);

    int updateByPrimaryKey(VwtSquare record);
}