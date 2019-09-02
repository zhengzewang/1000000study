package com.zzw.java1000000.z1182264.thread.way;

/**
 * @author zhengzewang on 2019/5/27.
 */
public class ThreadTest {

    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
        new MyThread(new MyRunnable()).start();
    }

}
