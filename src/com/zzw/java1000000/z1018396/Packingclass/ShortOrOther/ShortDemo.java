package com.zzw.java1000000.z1018396.Packingclass.ShortOrOther;

public class ShortDemo {
	
	public static void main(String[] args) {
		
		Short short1 = new Short("200");
		short s = 200;
		Short short2 = new Short(s);
		
		byte b = short1.byteValue();
		System.out.println(short1.compareTo((short) 198));
		System.out.println(short1.equals(short2));
		int i = short1.intValue();
		short t = short1.shortValue();
		System.out.println(short1.toString());
		float f = short1.floatValue();
		
		//关于在[-128,127]之间的问题
		Short.valueOf(s);//ShortCache
		Byte.valueOf((byte) 100);//ByteCache
		Long.valueOf(100l);//LongCache
		
		Float.valueOf(12.3f);//true
		Double.valueOf(12.6);//true
		
		float f1 = 12.3f;
		double d1 = 12.3;
		System.out.println(f1 == d1);//false
		
	}

}
