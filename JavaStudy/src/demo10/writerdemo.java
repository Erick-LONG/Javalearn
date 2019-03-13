package demo10;

import java.io.FileWriter;
import java.io.IOException;

public class writerdemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("./b.txt",true);) {
            fw.write(97);
            //fw.flush();
            fw.write("什么秘密木木木木");

        }catch (IOException e){
            System.out.println(e);
        }


    }
}
