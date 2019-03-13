package demo5;

public class DemoTest {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new Baozipu(bz).start();
        new Chihuo(bz).start();
    }
}
