package com.zzw.java1000000.z1018164.Object.GC;


import com.zzw.java1000000.z1018164.Object.newObject.ObjectTest;

public class TestGC {
	
	public static void main(String[] args) {
		new ObjectTest();
		System.gc();
		System.runFinalization();  
	}

}
