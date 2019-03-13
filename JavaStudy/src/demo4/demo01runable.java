package demo4;

public class demo01runable {
    public static void main(String[] args) {
//        runableimpl run = new runableimpl();
//        Thread th = new Thread(run);
//        th.start();

//        Thread t = new Thread(new runableimpl());
//        t.start();

//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println(Thread.currentThread().getName()+i);
//                }
//            }
//        }.start();



//        new Thread(new Runnable(){
//
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println(Thread.currentThread().getName()+i);
//                }
//            }
//        }).start();
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();

//        for (int i = 0; i < 20; i++) {
//            System.out.println(Thread.currentThread().getName()+i);
//        }

    }
}
