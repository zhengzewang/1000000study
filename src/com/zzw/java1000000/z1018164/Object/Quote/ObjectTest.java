package com.zzw.java1000000.z1018164.Object.Quote;

public class ObjectTest {
	
	private String id;
	
	public ObjectTest() {
	}
	
	public ObjectTest(String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		ObjectTest test1;
		test1 = new ObjectTest("test1");
		ObjectTest test2 = test1;
		test2.setId("test2");
		System.out.println(test1.getId());
		
		String str = "test";
		ObjectTest test = new ObjectTest("test");
		int i = 0;
		test(i);
		test(str);
		test(test);
		System.out.println(i);
		System.out.println(str);
		System.out.println(test.getId());
		test2(test);
		System.out.println(test.getId());
		
	}

	public static void test(int id){
		id = 1;
	}
	
	public static void test(String id){
		id = "test_id";
	}
	
	public static void test(ObjectTest test){
		test.setId("test_id");
	}
	
	public static void test2(ObjectTest test){
		test = new ObjectTest("test_id2");
	}

}
