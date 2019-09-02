package com.zzw.java1000000.z1011698.Unicode.byteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileDemo {
	
	private final static String pathname = "D:/html/ASCII.txt";
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		byte [] b = new byte[(int) file.length()];
		stream.read(b);
		stream.close();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+",");
		}
	}

}
