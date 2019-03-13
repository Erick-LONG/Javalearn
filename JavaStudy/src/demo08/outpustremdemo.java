package demo08;

import java.io.FileOutputStream;
import java.io.IOException;

public class outpustremdemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./a.txt",true);

        fos.write("你好".getBytes());
        fos.write("\n".getBytes());
        fos.close();
    }
}
