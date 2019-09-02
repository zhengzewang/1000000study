package com.zzw.java1000000.z1182264.thread.way;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("my thread");
    }

    public MyThread() {
        super();
    }

    public MyThread(Runnable runnable) {
        super(runnable);
    }
}
