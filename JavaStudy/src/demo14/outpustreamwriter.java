package demo14;

import java.io.*;

public class outpustreamwriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./f.txt"),"gbk");
        osw.write("你好");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("./f.txt"),
                "gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char) len);
        }

        isr.close();

    }
}
