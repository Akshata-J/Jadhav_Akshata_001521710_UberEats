package Business.DB4OUtil;

import Business.ConfigureASystem;
import Business.FoodDeliverySystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author akshatajadhav
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(FoodDeliverySystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(FoodDeliverySystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public FoodDeliverySystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        FoodDeliverySystem system;
//        ObjectSet<FoodDeliverySystem> systems1 = conn.query(FoodDeliverySystem.class); // Change to the object you want to save
//        for(FoodDeliverySystem s : systems1){
//            conn.delete(s);
//            conn.commit();
//        }
//        conn.close();
//        System.exit(1);
        ObjectSet<FoodDeliverySystem> systems = conn.query(FoodDeliverySystem.class);
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system =systems.get(systems.size() - 1);
                   //ConfigureASystem.configure();
                   //systems.get(systems.size() - 1);
        }
        
        conn.close();
        return system;
    }
}
