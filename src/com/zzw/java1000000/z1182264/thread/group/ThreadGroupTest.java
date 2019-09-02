package com.zzw.java1000000.z1182264.thread.group;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class ThreadGroupTest {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("线程组");
        new Thread(group, () -> System.out.println("线程组-线程1"),"线程1").start();
        Thread[] threads = new Thread[group.activeCount()];
        Thread.sleep(10);
        new Thread(group, () -> System.out.println("线程组-线程2"),"线程2").start();
        group.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }

    private static void base() {
        ThreadGroup group1 = new ThreadGroup("线程组1");
        ThreadGroup group2 = new ThreadGroup("线程组2");
        Thread thread1_0 = new Thread(group1, () -> System.out.println(Thread.currentThread().getThreadGroup()));
        Thread thread2_0 = new Thread(group2, () -> System.out.println(Thread.currentThread().getThreadGroup()));
        thread1_0.start();
        thread2_0.start();
    }

    private static void place() {
        ThreadGroup group1 = new ThreadGroup("线程组1");
        System.out.println(group1.getParent());
        Thread thread = new Thread(group1, () -> {
            ThreadGroup group2 = new ThreadGroup("线程组2");
            System.out.println(group2.getParent());
        });
        thread.start();
    }

}
