package com.zzw.java1000000.z1061342.Extends;

public class Impl implements Interface {
	public static void main(String[] args) {
		Impl impl = new Impl();
		System.out.println(impl instanceof Object);
		System.out.println(impl instanceof Interface);
	}	
}
interface Interface {}
