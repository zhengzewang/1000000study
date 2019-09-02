package com.zzw.java1000000.z1018365.function.define;

public class DefineFun {
	
	public static final synchronized void fun1(){
		
	}
	
	Void voidfun(){
		return null;
	}
	
	public static void main(String[] args) {
		fun(true);
	}
	
	static void fun(boolean bool){
		System.out.println("void fun");
		if(bool){
			return ;
		}
		System.out.println("void fun2");
	}

}
