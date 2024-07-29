package utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;

    public void configReader() throws FileNotFoundException {
        try {
            FileInputStream file = new FileInputStream("./src/main/resources/cofig.properties");
            prop = new Properties();
            prop.load(file);
        } catch (Exception e) {
            throw new FileNotFoundException();
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }

}
