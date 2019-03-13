package demo13;

import java.io.*;

public class charbufferdemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter buf = new BufferedWriter(new FileWriter("./e.txt"));
        for (int i = 0; i < 10; i++) {
            buf.write("哈哈哈");
            buf.newLine();
        }
        buf.close();

        //读取
        BufferedReader br = new BufferedReader(new FileReader("./e.txt"));
        //String line;
        while ((br.readLine()) != null){
            System.out.println(br.readLine());
        }
        br.close();
    }
}
