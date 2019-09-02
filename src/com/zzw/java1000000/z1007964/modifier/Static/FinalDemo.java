package com.zzw.java1000000.z1007964.modifier.Static;

public class FinalDemo {
	public final String finalAtt1 = "final_att1";
	public final String finalAtt2;
	public final String finalAtt3;
	public final String finalAtt4;
	//不管何种方式，都必须有初始化
	public FinalDemo() {
		finalAtt2 = "final_att2";
		finalAtt4 = "final_att4";
	}
	public FinalDemo(String arg) {
		finalAtt2 = "final_att2";
		finalAtt4 = arg;
	}
	{
		finalAtt3 = "final_att3";
	}
	
	public static void main(String[] args) {
		FinalDemo finalDemo = new FinalDemo();
		System.out.println(finalDemo.finalAtt1);
		System.out.println(finalDemo.finalAtt2);
		System.out.println(finalDemo.finalAtt3);
		System.out.println(finalDemo.finalAtt4);
		
		//error
//		finalDemo.finalAtt1 = "test";
	}
	
}
