package spingclouddemo.square.impl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spingclouddemo.square.impl.entity.Square;



@Repository
public interface SquareDao extends JpaRepository<Square,String> {






}
