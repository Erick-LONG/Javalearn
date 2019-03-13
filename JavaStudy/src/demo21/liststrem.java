package demo21;

import java.util.ArrayList;
import java.util.List;

public class liststrem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张哈哈");
        list.add("嘿嘿哈哈");
        list.add("嘎嘎嘎");
        list.add("张啦啦");
        list.add("张简爱家居");
        list.add("偶尔哦哦额");
        list.stream().filter(name ->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));


    }
}
