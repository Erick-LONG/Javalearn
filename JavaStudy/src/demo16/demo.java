package demo16;

public class demo {
    public static void show(myfuncinterface myinter){
        myinter.method();
    }

    public static void main(String[] args) {
        show(new myfucimpl());
        show(new myfuncinterface() {
            @Override
            public void method() {
                System.out.println("嘿嘿嘿");
            }
        });
        show(()-> System.out.println("使用lambda"));
    }
}
