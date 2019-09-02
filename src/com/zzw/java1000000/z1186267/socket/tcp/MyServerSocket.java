package com.zzw.java1000000.z1186267.socket.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class MyServerSocket {

    private ServerSocket serverSocket;
    private Socket socket;

    public MyServerSocket() throws IOException {
        serverSocket = new ServerSocket(8001);
        this.getServer();
    }

    private void getServer() throws IOException {
        System.out.println("创建ServerSocket成功");
        while (true) {
            System.out.println("等待客户端连接");
            socket = serverSocket.accept();
            System.out.println(socket.getInetAddress());
            System.out.println(socket.getRemoteSocketAddress());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String info = reader.readLine();
            int i = 0;
            while (info != null) {
                if (i++ == 0) {
                    System.out.println("接收到客户端的请求：");
                }
                System.out.println(info);
                info = reader.readLine();
            }
            socket.shutdownInput();
            //
            OutputStream os = socket.getOutputStream();
            PrintWriter ps = new PrintWriter(os);
            ps.write("欢迎您！");
            ps.flush();
            //
            ps.close();
            os.close();
            reader.close();
            socket.close();
        }
    }

    public static void main(String[] args) throws IOException {
        new MyServerSocket();
    }

}
