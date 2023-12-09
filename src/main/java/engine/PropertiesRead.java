package engine;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesRead {
    public static Properties properties;
    static String pageURL;

    public static void loadProperties() {
        try {
            properties = new Properties();
            properties.load(Files.newInputStream(Paths.get("./src/test/resources/config.properties")));
        } catch (IOException ex) {
            System.out.println("Failed to load config properties. ABORT!!");
            ex.printStackTrace();
        }
    }
    public static String getURL() {
        loadProperties();
        pageURL = properties.getProperty("pageUrl");
        return pageURL;
    }
    public static Map<String, String> readProperties(){
        Map<String,String> property=new HashMap<String, String>();
        loadProperties();
        property.put("browserName", (String) properties.get("browserName"));
        property.put("dbName",properties.getProperty("dbName"));
        property.put("dbUser",properties.getProperty("dbUser"));
        property.put("dbPassword",properties.getProperty("dbPassword"));
        return property;
    }
}
