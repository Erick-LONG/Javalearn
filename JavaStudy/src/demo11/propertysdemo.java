package demo11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class propertysdemo {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("找了","168");
        pro.setProperty("hahh ","1568");
        pro.setProperty("hahhgggg ","168");

        Set<String> set = pro.stringPropertyNames();
        for (String key:set
             ) {
            System.out.println(key + pro.getProperty(key));
        }

        FileWriter fw = new FileWriter("./c.txt");
        pro.store(fw,"abc");
        fw.close();

        Properties psd = new Properties();
        psd.load(new FileReader("./c.txt"));
        Set<String> set1 = psd.stringPropertyNames();
        for (String key:set1
        ) {
            System.out.println(key + psd.getProperty(key));
        }



    }
}
