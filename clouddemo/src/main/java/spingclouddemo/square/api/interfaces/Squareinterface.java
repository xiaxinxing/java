package spingclouddemo.square.api.interfaces;

import spingclouddemo.MybatisFile.example.VwtSquare;
import spingclouddemo.square.impl.entity.Square;

import java.util.List;

public interface Squareinterface {

    public Square findSquareById(String id);

    public List<Square> findSquarePage(int pageindex, int pagenum);

    public Object findSquareByJdbc(String id);

    public String FindFirstSquare();

    public VwtSquare SelectSquare(String squarename, int type);
}
