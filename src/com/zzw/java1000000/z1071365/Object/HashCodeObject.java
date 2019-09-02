package com.zzw.java1000000.z1071365.Object;

public class HashCodeObject {
	
	public HashCodeObject() {
		//
	}
	
	public HashCodeObject(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 重写equals尽量重写hashCode。保证equals为true的情况下，hashCode一定相同。
	 * <br>
	 * 虽然hashCode相等的情况下，无需强制保证equals为true，但算法设计尽量使hashCode唯一
	 * <br>
	 * 即满足：
	 * 1、hashCode不相同，则equals一定为false
	 * 2、equals为true，hashCode一定相同
	 * 3、hashCode相同，equals不一定为true，但尽量保证为true（所以，用hashCode做相同检验是不可靠的）
	 * 
	 * 所以判断相等的高效算法是：{@link HashCodeObject#compareTo(Object)}
	 */
	@Override
	public int hashCode() {
		this.id = this.id.replaceAll(",", ",,");
		this.id = this.id.replaceAll("-", ",");
		this.name = this.name.replaceAll(",", ",,");
		this.name = this.name.replaceAll("-", ",");
		return (this.id+"-"+this.name).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HashCodeObject) {
			HashCodeObject object = (HashCodeObject) obj;
			if (object.getId().equals(this.id) && object.getName().equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean compareTo(Object obj) {
		if (obj.hashCode() != this.hashCode()) {
			return false;
		}
		return this.equals(obj);
	}

}
