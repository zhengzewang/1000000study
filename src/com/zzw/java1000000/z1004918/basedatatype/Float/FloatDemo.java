package com.zzw.java1000000.z1004918.basedatatype.Float;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.z0911.utils.Binary.BinaryUtils;

public class FloatDemo {
	
	public static void main(String[] args) {
		
		float f 	= 34028235654123654789541236541253455.9874f;
		float f2 	= 3.4028236E34f;
		float f3 	= 34028235600000000000000000000000000.0000f;
		System.out.println(f);
		System.out.println(f == f2);
		System.out.println(f == f3);
		
//		String mstr = "1." + (powInt(2, 23)-1);
		String mstr = "1" + ".9999998807907104";//二进制0.11111111111111111111111对应的十进制为0.9999998807907104
		System.out.println("M:"+mstr);
//		System.out.println((double)powInt(2, 127));//long不支持那么大的
//		System.out.println((Math.pow(2, 127))*(Double.valueOf(mstr)));
		BigDecimal E = new BigDecimal(powBigInt(2, 127));
		BigDecimal bigDecimal = E.multiply(new BigDecimal(mstr));
		System.out.println(bigDecimal);//精准计算
//		System.out.println((2-Math.pow(2, -23))*(Math.pow(2, 127)));
		
		System.out.println();
		System.out.println(bigDecimal.doubleValue());
		
		
//		BinaryUtils.bigDecimalToBinary("123.875");
//		System.out.println(BinaryUtils.bigDecimalToBinary("123.875"));
		
		
		
		System.out.println((powBigInt(2, 127).doubleValue())*(Double.valueOf(mstr)));
		
//		System.out.println(powBigInt(2, 127));
	}
	
	static long powInt(int a,int b){
		long result = 1;
		for (int i = 0; i < b; i++) {
			result = result*a;
		}
		
		return result;
	}
	
	static BigInteger powBigInt(int a, int b){
		BigInteger bigInteger = new BigInteger("1");
		for (int i = 0; i < b; i++) {
			bigInteger = bigInteger.multiply(new BigInteger(""+a));
		}
		return bigInteger;
	}

}
