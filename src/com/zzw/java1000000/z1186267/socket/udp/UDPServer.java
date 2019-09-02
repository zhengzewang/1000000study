package com.zzw.java1000000.z1186267.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author zhengzewang on 2019/7/4.
 */
public class UDPServer {

    private DatagramSocket socket;
    private DatagramPacket packet;

    private UDPServer() throws IOException {
        socket = new DatagramSocket();
        byte[] bytes = "为实现中华民族伟大复兴的中国梦不懈奋斗".getBytes();
        // 创建一个数据包，并指定发送的数据包地址
        packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8002);
        try {
            // 10s后数据将发送
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        socket.send(packet);
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new UDPServer();
    }

}
