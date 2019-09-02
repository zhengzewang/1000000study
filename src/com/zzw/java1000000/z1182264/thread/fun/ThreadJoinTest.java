package com.zzw.java1000000.z1182264.thread.fun;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class ThreadJoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (i < 10) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    i++;
                }
            }
            System.out.println("join线程执行完毕");
        });
        thread.start();
        thread.join(); // 必须先start
        System.out.println("main线程");
    }

}
