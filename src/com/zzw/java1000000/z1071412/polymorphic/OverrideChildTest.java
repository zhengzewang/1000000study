package com.zzw.java1000000.z1071412.polymorphic;

public class OverrideChildTest extends OverrideParentTest {
	
	@Override
	public void test() {
		System.out.println("child_test");
	}
	
//	@Override // 编译报错
	public static void static_test(){
		System.out.println("child_static_test");
	}
	
	public static void main(String[] args) {
		OverrideChildTest test = new OverrideChildTest();
		test.test();
		test.static_test();
		OverrideParentTest test1 = (OverrideChildTest)test;
		test1.test();
		test1.static_test();
	}


}
