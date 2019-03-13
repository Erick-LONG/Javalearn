package demo18;

import java.util.Arrays;
import java.util.Comparator;

public class comparatordemo {
    public static Comparator<String> getcomparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };
        return (o1,o2)-> o2.length() - o1.length();
    }
    public static void main(String[] args) {
        String[] arr =  {"aaaa","vbbbccccc","cc"};
        Arrays.sort(arr,getcomparator());
        System.out.println(Arrays.toString(arr));
    }
}

