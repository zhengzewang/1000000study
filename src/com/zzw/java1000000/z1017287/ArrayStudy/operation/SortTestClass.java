package com.zzw.java1000000.z1017287.ArrayStudy.operation;

public class SortTestClass extends SortTestClassParent implements Comparable<SortTestClass>,Cloneable{
	
	private String id;
	
	public SortTestClass(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id;
	}

	@Override
	public int compareTo(SortTestClass o) {
		return id.compareTo(o.getId());
	}
	
	/**
	 * 如果想要调用object的clone方法，就必须显示的重写。因为clone方法在object中是protected类型的
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
