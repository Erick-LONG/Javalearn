package demo17;

public class demolambda {
    public static void showlog(int level , msgbuider mb){
        if (level ==1){
            System.out.println(mb.buildmsg());
        }

    }
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";
        showlog(1,()->msg1+msg2+msg3);
    }
}
