package spingclouddemo.Utils;

/*import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;*/

/**MongoDB 实现类*/
public class MongodbUtil {

    private final static MongodbUtil INSTANCE = new MongodbUtil();

   /* private static MongoClient mongoClient;

    private String databaseName="test";
    private String mongodb_username="xxx";
    private String mongodb_password="xxx";


    public MongodbUtil() {
        if(mongoClient==null) {
            mongoClient = new MongoClient("127.0.0.1", 27017);
        }
    }

    public Object GetMongobd(String collectionName){
        MongoDatabase test = mongoClient.getDatabase(databaseName);
        MongoCollection<Document> users = test.getCollection(collectionName);
        MongoCursor<Document> iterator =users.find().iterator();
        while (iterator.hasNext()){
             Document next = iterator.next();
             String id =next.get("_id").toString();
        }


        return null;
    }*/

}
