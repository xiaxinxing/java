package spingclouddemo.square.impl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="vwt_square")
public class Square implements Serializable {


    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Square{" + "id='" + id + '\'' + '}';
    }
}
