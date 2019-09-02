package com.zzw.java1000000.z1017980.Objectoriented.characteristics.inherit;

public class Test {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(23, 23);
		Square square = new Square(40);
		Rectangle rectangle2 = square.changeHeight(50);//改变正方形的一个边后，明显这个正方形就变成了矩形
		System.out.println(square.area());
	}

}
