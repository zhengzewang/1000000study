package com.zzw.java1000000.z1017980.Objectoriented.characteristics.inherit;

/**
 * 矩形类
 * @author zhengzewang
 *
 */
public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	/**
	 * 计算周长
	 * @return
	 */
	public double Perimeter(){
		return width*2 + height*2;
	}
	
	/**
	 * 计算面积
	 * @return
	 */
	public double area(){
		return width*height;
	}
	
	/**
	 * 改变高，返回一个新的矩形
	 * @param height
	 * @return
	 */
	public Rectangle changeHeight(double height){
		return new Rectangle(this.width, height);
	}
	
	/**
	 * 返回宽，返回一个新的矩形
	 * @param width
	 * @return
	 */
	public Rectangle changeWidth(double width){
		return new Rectangle(width, this.height);
	}

}
