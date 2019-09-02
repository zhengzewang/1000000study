package com.zzw.java1000000.z1007964.modifier.Class;

public class PublicChild extends PublicParent{
	
	public String publicAtt = "child public Att";
	
	//重写父类public方法只能还是public修饰
	public void pulicFun(){
		System.out.println("parent public fun");
	}
	
	//重写父类protected方法可以是protected也可以是public。不能是default
	@Override
	public void protectedFun(){
		System.out.println("parent protected fun");
	}
	
	//父类的private方法不能被继承
//	@Override
	private void privateFun(){
		System.out.println("parent private fun");
	}
	
	//重写父类default方法可以是除了private之外的任何访问控制修饰符
	@Override
	protected void defaultFun(){
		System.out.println("parent default fun");
	}

}
