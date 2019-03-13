package demo7;

import java.io.File;

public class demofile {
    public static void main(String[] args) {
        File f1 = new File("./");
        getAllFile(f1);

    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        for (File f:files
             ) {
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                System.out.println(f);
            }
            
        }
    }
}
