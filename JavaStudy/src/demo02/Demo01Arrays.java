package demo02;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,9};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
        System.out.println(Math.abs(-21));
        System.out.println(Math.ceil(21.1));
        System.out.println(Math.floor(21.1));
        System.out.println(Math.round(21.5));
    }
}
