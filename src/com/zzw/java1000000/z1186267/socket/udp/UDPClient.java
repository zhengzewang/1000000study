package com.zzw.java1000000.z1186267.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zhengzewang on 2019/7/4.
 */
public class UDPClient {

    private DatagramSocket socket;
    private DatagramPacket packet;

    private UDPClient() throws IOException {
        socket = new DatagramSocket(8002);
        packet = new DatagramPacket(new byte[1024], 1024);
        // 接收到消息之前会阻塞
        socket.receive(packet);
        System.out.println("接收到数据：" + new String(packet.getData()));
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new UDPClient();
    }

}
