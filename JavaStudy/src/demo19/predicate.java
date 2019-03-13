package demo19;

import java.util.function.Predicate;

public class predicate {
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static boolean campString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(checkString(s,str -> str.length() >5));
        System.out.println(campString(s,str->str.length() >4,str->str.contains("a")));
    }
}
