package demo20;

import java.util.function.Function;

public class funcdemo {
    public static void main(String[] args) {
        String s = "1234";
        change(s,(str)->Integer.parseInt(str));
    }

    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }
}
