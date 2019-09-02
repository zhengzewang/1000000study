package com.zzw.java1000000.z1182264.thread.priority;

/**
 * @author zhengzewang on 2019/5/27.
 */
public class PriorityTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("线程1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.setPriority(8);
        //
        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("线程2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.setPriority(2);
        thread1.start();
        thread2.start();
    }

}
