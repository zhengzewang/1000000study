package com.zzw.java1000000.z1186267.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class MyClient {

    public MyClient() throws IOException {
        connect();
    }

    private void connect() throws IOException {
        Socket socket = new Socket("127.0.0.1", 8001);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        writer.write("测试");
        writer.flush();
        socket.shutdownOutput();
        //
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String info = reader.readLine();
        int i = 0;
        while (info != null) {
            if (i++ == 0) {
                System.out.println("收到服务端响应：");
            }
            System.out.println(info);
            info = reader.readLine();
        }
        reader.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new MyClient();
    }

}
