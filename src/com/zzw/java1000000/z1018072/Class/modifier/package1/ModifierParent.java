package com.zzw.java1000000.z1018072.Class.modifier.package1;

public class ModifierParent {
	private String privateStr = "privateStr";
	protected String protectedStr = "protectedStr";
	public String publicStr = "publicStr";
	String defaultStr = "defaultStr";
	
	private void privateFun(){
		System.out.println("privateFun");
	}
	protected void protectedFun(){
		System.out.println("protectedFun");
	}
	public void publicFun(){
		System.out.println("publicFun");
	}
	void defaultFun(){
		System.out.println("defaultFun");
	}
	public class publicInnerClass{
		@Override
		public String toString() {
			return "publicInnerClass";
		}
	}
	protected class protectedInnerClass{
		public protectedInnerClass() {
		}

		@Override
		public String toString() {
			return "protectedInnerClass";
		}
	}
	private class privateInnerClass{
		@Override
		public String toString() {
			return "privateInnerClass";
		}
	}
	class defaultInnerClass{
		@Override
		public String toString() {
			return "defaultInnerClass";
		}
	}
}

class FriendClass{
	
}
