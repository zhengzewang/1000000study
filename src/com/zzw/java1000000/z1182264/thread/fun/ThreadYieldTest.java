package com.zzw.java1000000.z1182264.thread.fun;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengzewang on 2019/5/28.
 */
public class ThreadYieldTest {

    static boolean over = false;
    static Map<Integer, Integer> tCount = new HashMap<>();

    public static void main(String[] args) {
        int j = 0;
        tCount.put(1, 0);
        tCount.put(2, 0);
        while (j++ < 10000) {
            Thread thread1 = new Thread(() -> {
                int i = 0;
                while (i++ < 1000) {
//                    Thread.yield(); //
                }
                over(1);
            });
            Thread thread2 = new Thread(() -> {
                int i = 0;
                while (i++ < 1000) {
                }
                over(2);
            });
            thread1.start();
            thread2.start();
            while (thread1.isAlive() || thread2.isAlive()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            over = false;
        }
        //
        System.out.println("线程1先结束次数：" + tCount.get(1));
        System.out.println("线程2先结束次数：" + tCount.get(2));
    }

    public synchronized static boolean over(Integer i) {
        if (!over) {
            over = true;
            tCount.put(i, tCount.get(i) + 1);
            return false;
        }
        return true;
    }

}
