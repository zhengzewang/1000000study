package com.zzw.java1000000.z1008289.operator.Instanceof.Demo;

import com.zzw.java1000000.z1008289.operator.Instanceof.EgClass.InstanceofChild;
import com.zzw.java1000000.z1008289.operator.Instanceof.EgClass.InstanceofParent;

public class InstanceofDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InstanceofParent parent = new InstanceofParent();//父类
		InstanceofParent parent_child = new InstanceofChild();//父类指向子类
		InstanceofChild child = new InstanceofChild();//子类
		System.out.println(parent instanceof InstanceofParent);
		System.out.println(parent instanceof InstanceofChild);
		System.out.println(parent_child instanceof InstanceofParent);
		System.out.println(parent_child instanceof InstanceofChild);
		System.out.println(child instanceof InstanceofParent);
		System.out.println(child instanceof InstanceofChild);
		
		int a = 5;
		//error
//		System.out.println(a instanceof int);
		//error
//		System.out.println(a instanceof Integer);
		char c[] = {'a','b'};
		System.out.println(c instanceof char[]);
		String str = "test";
		System.out.println(str instanceof Object);
		System.out.println(str instanceof String);
	}

}
