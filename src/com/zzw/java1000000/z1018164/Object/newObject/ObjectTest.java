package com.zzw.java1000000.z1018164.Object.newObject;

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
		ObjectTest test1 = new ObjectTest();
		ObjectTest test2 = new ObjectTest("test");
		System.out.println(test1.id);
		System.out.println(test2.getId());
	}
}
