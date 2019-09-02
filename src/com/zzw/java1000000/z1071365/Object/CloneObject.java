package com.zzw.java1000000.z1071365.Object;

public class CloneObject implements Cloneable {
	
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneObject object1 = new CloneObject();
		object1.setId("zzw");
		CloneObject object2 = (CloneObject) object1.clone();
		System.out.println(object2 == object1);//false
		object2.setId("wjy");
		System.out.println(object1.getId());//zzw
		System.out.println(object2.getId());//wjy
	}
}
