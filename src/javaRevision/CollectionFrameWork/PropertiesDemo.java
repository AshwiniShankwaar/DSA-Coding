package javaRevision.CollectionFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","Ashwini");
        try {
//            FileOutputStream fos = new FileOutputStream("abc.properties");
//            properties.store(fos,"udated by ashwini");
            FileInputStream fis = new FileInputStream("abc.properties");
            properties.load(fis);
            System.out.println(properties.getProperty("username"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
