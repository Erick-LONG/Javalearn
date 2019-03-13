package demo12;

import java.io.*;

public class bufferdemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fou = new FileOutputStream("./d.txt");
        BufferedOutputStream bfo = new BufferedOutputStream(fou);
        bfo.write("哈哈哈哈哈哈哈哈".getBytes());
        bfo.close();

        FileInputStream fin = new FileInputStream("./d.txt");
        BufferedInputStream buf = new BufferedInputStream(fin);
        byte[] bytes= new byte[1024];

        int len = 0;
        while ((len = buf.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        buf.close();

    }
}
