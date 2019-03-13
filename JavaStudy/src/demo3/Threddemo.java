package demo3;

public class Threddemo {
    public static void main(String[] args) {
        MyThred mt = new MyThred();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

    }
}
