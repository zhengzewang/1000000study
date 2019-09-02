package com.zzw.java1000000.z1007964.modifier.Test;

import com.zzw.java1000000.z1007964.modifier.Interface.PublicInterface;

public class InterfaceTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/**
		 * 接口的默认访问修饰符为default，同一包访问
		 */
//		String str = DefaultInterface.str;//
		
		/**
		 * 
		 * 接口的成员变量默认访问修饰符为public
		 */
		String str = PublicInterface.str;
		
	}

}
