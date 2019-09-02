package com.zzw.java1000000.z1007964.modifier.Class;

public class InnerClass {
	
	public class InPublicClass{
		
	}
	
	private class InPrivateClass{
		
	}
	
	protected class InProtectedClass{
		
	}
	
	public static void main(String[] args) {
		InClass inClass = new InClass();
	}
	
}

/**
 * 同级类
 * @author zhengzewang
 *
 */
class InClass{
	
	public void fun(){
		System.out.println("inclass");
	}
	
}

/**
 * error
 */
//protected class InProClass{
//	
//}

/**
 * error
 * @author zhengzewang
 *
 */
//public class InPubClass{
//	
//}

/**
 * error
 * @author zhengzewang
 *
 */
//private class InPriClass{
//	
//}
