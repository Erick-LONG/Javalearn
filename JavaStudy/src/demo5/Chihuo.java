package demo5;

public class Chihuo extends Thread {
    private Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃包子"+bz.pi+bz.xian);
                bz.flag=false;
                bz.notify();
                System.out.println("吃货已经出完"+bz.pi+bz.xian);
            }
        }
    }
}
