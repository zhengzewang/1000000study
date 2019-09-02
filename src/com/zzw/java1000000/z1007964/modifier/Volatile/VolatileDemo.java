package com.zzw.java1000000.z1007964.modifier.Volatile;

/**
 * 还是没有搞明白。
 * @author zhengzewang
 *
 */
public class VolatileDemo implements Runnable{
    private volatile boolean active;
    @Override
    public void run(){
        active = true;
        while (active) // 第一行
        {
            try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("test");
        }
    }
    public void stop(){
        active = false; // 第二行
    }
    
    public static void main(String[] args) {
		
    	VolatileDemo demo = new VolatileDemo();
    	
    	Thread thread = new Thread(demo);
    	
    	thread.start();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	demo.stop();
    	
	}
}
