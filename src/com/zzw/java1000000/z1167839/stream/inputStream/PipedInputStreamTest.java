package com.zzw.java1000000.z1167839.stream.inputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author zhengzewang on 2019/4/7.
 */
public class PipedInputStreamTest {

    public static void main(String[] args) throws IOException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
        pipedOutputStream.write(1);
        System.out.println(pipedInputStream.read());
//        test();
        pipedOutputStream.flush();
        pipedOutputStream.close();
    }

    private static void test() throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedInputStream.connect(pipedOutputStream);
        new Thread(() -> {
            while (true) {
                try {
                    System.out.println("读取到数据：" + (byte) pipedInputStream.read());
                } catch (IOException e) {
                    System.out.println("读取数据结束"); // 当输出线程关闭，抛出异常
                    break;
                }
            }
        }).start();
        new Thread(() -> {
            int i = '0';
            while (i <= '9') {
                try {
                    pipedOutputStream.write(i++);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void lock1() throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedInputStream.connect(pipedOutputStream);
        pipedInputStream.read(); // 会一直等待有数据输出到pipedOutputStream
    }

    public static void lock2() throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        pipedInputStream.connect(pipedOutputStream);
        new Thread(() -> {
            try {
                pipedOutputStream.write(2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println(pipedInputStream.read());
        System.out.println("开始第二次读入数据");
        System.out.println(pipedInputStream.read());
        System.out.println("程序走不到这里");
    }

}
