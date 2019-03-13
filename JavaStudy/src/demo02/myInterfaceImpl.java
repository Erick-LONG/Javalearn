package demo02;

public interface myInterfaceImpl {
    public static void methodStatic(){
        System.out.println("这是静态方法");
    }
    public default void methodDefault1(){
        System.out.println("这是一个默认方法");
        common();
    }
    public default void methodDefaul2(){
        System.out.println("这是一个默认方法");
        common();
    }

    public static void staitic1(){
        System.out.println("这是一个静态方法");
        commonStaitic();
    }
    public static void staitic2(){
        System.out.println("这是一个静态方法");
        commonStaitic();
    }

    private void common(){
        System.out.println("公共");
    }
    private static void commonStaitic(){
        System.out.println("公共");
    }

    public static final int NUM_OF_MY = 10;

    public abstract void absMethod();
}
