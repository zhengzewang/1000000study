package com.zzw.java1000000.z1182264.thread.fun;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class ThreadDaemonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("守护线程");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i < 3) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    i++;
                }
            }
        });
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        System.out.println(thread1.isDaemon());
    }

}
