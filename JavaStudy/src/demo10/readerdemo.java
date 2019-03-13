package demo10;

import java.io.FileReader;
import java.io.IOException;

public class readerdemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./a.txt");
//        int len =0;
//        while ((len = fr.read()) != -1){
//            System.out.println((char) len);
//        }

        char[] cs =new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1){
            System.out.println(new String(cs,0,len));
        }

        fr.close();

    }
}
