package com.zzw.java1000000.z1182264.thread.fun;

/**
 * @author zhengzewang on 2019/5/29.
 */
public class ThreadCurrendTest {

    public static void main(String[] args) throws InterruptedException {
        final ThreadGroup threadGroup = Thread.currentThread().getThreadGroup(); //
        System.out.println(threadGroup);
        //
        Thread thread = new Thread(() -> {
            ThreadGroup group = Thread.currentThread().getThreadGroup();
            System.out.println(group);
            new Thread(() -> {
                int i = 0;
                System.out.println("内部线程组：" + Thread.currentThread().getThreadGroup());
                while (i++ < 10) {
                    System.out.println("内部线程");
                    try {
                        Thread.sleep(1000);
                        new Thread(() -> System.out.println("内内部线程组：" + Thread.currentThread().getThreadGroup())).start();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        });
        thread.start();
        while (thread.isAlive()) {
            Thread.sleep(10);
        }
        System.out.println("thread已死");
    }

}
