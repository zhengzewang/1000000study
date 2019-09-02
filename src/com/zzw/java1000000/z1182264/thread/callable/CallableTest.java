package com.zzw.java1000000.z1182264.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author zhengzewang on 2019/6/9.
 */
public class CallableTest implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {
        System.out.println(Thread.currentThread());
        System.out.println("call");
        Thread.sleep(1000);
        return 99;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread());
        CallableTest callableTest = new CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(callableTest);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
