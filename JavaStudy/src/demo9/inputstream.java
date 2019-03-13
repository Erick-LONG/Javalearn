package demo9;

import java.io.FileInputStream;
import java.io.IOException;

public class inputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(len);
            System.out.println(new String(bytes,0,len));
        }
        //int read = fis.read();

        fis.close();
    }

}
