package com.zzw.java1000000.z1017980.Objectoriented.characteristics.inherit;

public class Square extends Rectangle{

	public Square(double edge) {
		super(edge, edge);
	}
	
	/**
	 * 改变边长，生成一个新的正放形
	 * @param edge
	 * @return
	 */
	public Square changeEdge(double edge){
		return new Square(edge);
	}

}
