package com.zzw.java1000000.z1167839.stream.reader;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class PipedReaderTest {

    public static void main(String[] args) throws IOException {
//        lock1();
//        lock2();
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader(pipedWriter);
        new Thread(() -> {
            while (true) {
                try {
                    System.out.print((char) pipedReader.read());
                } catch (IOException e) {
                    // TODO 异常被吃掉了，为什么不提供一个方法判断连接是否关闭
                    break;
                }
            }
        }).start();
        new Thread(() -> {
            String str = "为实现中华民族伟大复兴的中国梦不懈奋斗";
            for (char c : str.toCharArray()) {
                try {
                    pipedWriter.write(c);
                    Thread.sleep(2000);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private static void lock1() throws IOException {
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader(pipedWriter);
        pipedReader.read(); // 一直等待
    }

    private static void lock2() throws IOException {
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader(pipedWriter);
        //
        new Thread(() -> {
            try {
                pipedWriter.write(97);
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
        System.out.println(pipedReader.read());
        System.out.println("已读取一次数据");
        System.out.println(pipedReader.read()); // 一直等待
        System.out.println("已读取两次数据");
    }

}
