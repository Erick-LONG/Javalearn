package demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo04 {
    public static void main(String[] args) {
        SimpleDateFormat stf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(stf.format(new Date()));
        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        StringBuilder sb = new StringBuilder();
        sb.append(11).append(33).append(44);
        System.out.println(sb);
        System.out.println(sb.toString());
        demo01();

    }

    private static void demo01() {
        int[] arr = {1,2,34,5};
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
