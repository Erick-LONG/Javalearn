package demo15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket soc = server.accept();
        InputStream is = soc.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os = soc.getOutputStream();
        os.write("收到谢谢！".getBytes());
        soc.close();
        server.close();


    }
}
