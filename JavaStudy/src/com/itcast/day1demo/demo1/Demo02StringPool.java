package com.itcast.day1demo.demo1;

public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "Abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str2));
        int length = "hhhhhhhhkjdjkfdf".length();
        System.out.println(length);
        String concat = str1.concat(str2);
        System.out.println(concat);
        char c = "hahhahah".charAt(1);
        System.out.println(c);
        int ka = "kakkakakka".indexOf("ka");
        System.out.println(ka);
        String substring = "yyeueyueyeue".substring(5);
        System.out.println(substring);
        String substring1 = "lallalalla".substring(2, 5);
        System.out.println(substring1);
        char[] chars = "hahhaheoll".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String o = "How do you do".replace("o", "*");
        System.out.println(o);
        String[] split = "aa,bb,cc".split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


    }
}

