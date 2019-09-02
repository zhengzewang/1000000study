package com.zzw.java1000000.z1018396.Packingclass.Boolean;

public class BooleanDemo {
	
	public static void main(String[] args) {
		
		//创建对象
		Boolean boolean1 = true;
		Boolean boolean2 = new Boolean(true);
		Boolean boolean3 = new Boolean("true");
		
		//常用方法
		boolean b = boolean1.booleanValue();
		System.out.println(boolean2.equals(boolean3));
		boolean1.compareTo(boolean2);
		System.out.println(Boolean.compare(boolean1, boolean2));//static
		System.out.println(boolean1.toString());
		
		boolean c = Boolean.parseBoolean("true");
		Boolean boolean4 = Boolean.valueOf(true);
		
		//常量
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.TYPE);
		
	}

}
