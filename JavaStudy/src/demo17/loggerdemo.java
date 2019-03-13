package demo17;

public class loggerdemo {
    public static void showlog(int level , String msg){
        if (level ==1){
            System.out.println(msg);
        }

    }

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showlog(1,msg1+msg2+msg3);

    }
}
