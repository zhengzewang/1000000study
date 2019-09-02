package com.zzw.java1000000.z1007964.modifier.Abstract.Interface;

public interface AbstractInterface {
	
	public void fun1();
	
	//error
//	protected void fun2();
	
	//接口中的方法默认为public。不声明也是public
	void fun3();
	
	abstract void fun4();

}
