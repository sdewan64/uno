package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    public static Properties properties = new Properties();
    public static final String PROPERTY_HOST = "host";
    public static final String PROPERTY_PORT = "port";

    public static void getAllProperties(){
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);

        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

}
