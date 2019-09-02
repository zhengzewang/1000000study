package com.zzw.java1000000.z1005480.IEEE754;

import com.z0911.utils.Binary.BinaryUtils;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * 
 * @author zhengzewang
 *
 */
public class IEEE754Float {
	
	private static final BigDecimal BIG_DECIMAL_ZERO = new BigDecimal("0");
	private static final BigDecimal BIG_DECIMAL_ONE = new BigDecimal("1");
	private static final BigDecimal BIG_DECIMAL_TWO = new BigDecimal("2");
	private static final BigDecimal BIG_DECIMAL_TEN = new BigDecimal("10");
	
	private static final BigDecimal MIN_FLOAT_DIGIT = new BigDecimal("0.00000000000000000000001");
	
	public static void main(String[] args) {
		System.out.println(byteToFloatStr("10000000000000000000000000000001"));//float能表示的最小数
		System.out.println(byteToFloatStr("01111111011111111111111111111111"));//float能表示的最大数
		System.out.println(byteToFloatStr("00111101111000010100011110101110"));//0.5
		System.out.println();
		
		System.out.println(floatStrToByte("-0.00000000000000000000000000000000000000000000140129846432481707092372958328991613128026194187651577175706828388979108268586060148663818836212158203125"));
		System.out.println(floatStrToByte("340282346638528859811704183484516925440.00000000000000000000000"));
		System.out.println(floatStrToByte("0.11"));
		System.out.println(floatStrToByte("0.109999999403953552246093750"));
		
//		float f = 0.11f;
//		float f1= 0.109999999403953552246093750f;
//		System.out.println(f == f1);//true
		
	}
	
	/**
	 * 十进制浮点数转化为32位byte
	 * @param floatStr
	 * @return
	 */
	public static String floatStrToByte(String floatStr){
		try {
			BigDecimal bigDecimal = new BigDecimal(floatStr);//校验格式
			if(bigDecimal.compareTo(BIG_DECIMAL_ZERO) == 0){
				return "00000000000000000000000000000000";
			}
			String binary = BinaryUtils.bigDecimalToBinary(floatStr);//转化为二进制
			//左移或者右移
			BigDecimal binary_Decimal = new BigDecimal(binary).abs();
			int e = 127;
			while(binary_Decimal.compareTo(BIG_DECIMAL_TEN) >= 0 ){//大于等于10，小数点左移
				binary_Decimal = binary_Decimal.divide(BIG_DECIMAL_TEN);
				e++;
			}
			while(binary_Decimal.compareTo(BIG_DECIMAL_ONE)<0 && e >1 ){//小于1就往右移
				binary_Decimal = binary_Decimal.multiply(BIG_DECIMAL_TEN);
				e--;
			}
			//如果当e移动到最小时，该值仍小于1，则当做特殊情况处理。
			if( e == 1 ){
				if(binary_Decimal.compareTo(MIN_FLOAT_DIGIT)<0){//当0处理（无论正负都逼近于0）
					if(bigDecimal.compareTo(BIG_DECIMAL_ZERO)>=0){
						return "00000000000000000000000000000000";//+0
					}else {
						return "10000000000000000000000000000000";//-0
					}
				}else {
					e = 0;
				}
			}
			if(e > 254){//无穷大
				if(bigDecimal.compareTo(BIG_DECIMAL_ZERO)>=0){
					return "01111111100000000000000000000000";//正无穷大
				}else {
					return "11111111100000000000000000000000";//负无穷大
				}
			}
			
			String binary_e = BinaryUtils.integerToBinary(new Integer(e).toString());//指数二进制
			while(binary_e.length() < 8){
				binary_e = "0" + binary_e;
			}
			String binary_m = "";
			//尾数只保留小数部分
			if(binary_Decimal.compareTo(BIG_DECIMAL_ONE) > 0){//大于等于1则减1
				binary_Decimal = binary_Decimal.subtract(BIG_DECIMAL_ONE);
			}else if(binary_Decimal.compareTo(BIG_DECIMAL_ONE) == 0){
				binary_m = "00000000000000000000000";
			}
			if(binary_m.equals("")){
				binary_m = binary_Decimal.toPlainString().substring(2);
				while (binary_m.length() < 23) {
					binary_m += "0";
				}
				if(binary_m.length() > 23){
					binary_m = binary_m.substring(0,23);
				}
			}
			
			String sign = bigDecimal.compareTo(BIG_DECIMAL_ZERO) > 0 ? "0" : "1";
			
			return sign + binary_e + binary_m;
		} catch (Exception e) {
			return "01111111110000000000000000000000";//NaN
		}
	}
	
	/**
	 * 将二进制转换为float，根据ieee 754标准
	 * 二进制为4字节32位，字符串bytes除了0和1不含任何字符
	 * @param bytes 大于32位或含有其他非0或1字符抛出异常。小于32位自动在后面补0
	 * @return
	 */
	public static String byteToFloatStr(String bytes){
		try {
			if(bytes.length() > 32){
				throw new Exception("bytes too long");
			}
			if(bytes.length() <= 0){
				throw new Exception("bytes is empty");
			}
			if(bytes.contains(".")){
				throw new Exception("NaN");
			}
			bytes = BinaryUtils.estimateBinary(bytes);
			if(bytes.length() < 32){
				for (int i = bytes.length(); i < 32; i++) {
					bytes += "0";
				}
			}
			String sign = bytes.charAt(0) + "";//符号位
			String exponent = bytes.substring(1, 9);//指数位
			String mantissa = bytes.substring(9);//尾数
			mantissa = "1." + mantissa;
			
			String int_exponent = BinaryUtils.binaryToInteger(exponent);
			String int_mantissa = BinaryUtils.binaryToBigDecimal(mantissa);
			
			BigDecimal bigDecimal_e = new BigDecimal(int_exponent);
			BigDecimal bigDecimal_m = new BigDecimal(int_mantissa);
			
			if(bigDecimal_e.compareTo(new BigDecimal("255")) == 0){//指数最大，全为1
				//1.小数为0，即尾数为1的时候，表示无穷大，正负与符号位相关
				if(bigDecimal_m.compareTo(BIG_DECIMAL_ONE) == 0){
					if(sign.equals("0")){
						return Float.POSITIVE_INFINITY+"";
					}else {
						return Float.NEGATIVE_INFINITY+"";
					}
				}else {
					//否则为NAN
					return "NaN";
				}
			}
			if(bigDecimal_e.compareTo(BIG_DECIMAL_ZERO) == 0){//指数最小，全为0
				if(bigDecimal_m.compareTo(new BigDecimal("1")) == 0){//如果小数也为0
					if(sign.equals("0")){
						return "0";
					}else {
						return "-0";
					}
				}else {
					BigDecimal E = BIG_DECIMAL_TWO.pow(bigDecimal_e.intValue()).divide(BIG_DECIMAL_TWO.pow(126));
					BigDecimal V = new BigDecimal("-1").pow(Integer.valueOf(sign)).multiply(E).multiply(bigDecimal_m.subtract(BIG_DECIMAL_ONE));
					return V.toPlainString();
				}
			}
			BigDecimal E = BIG_DECIMAL_TWO.pow(bigDecimal_e.intValue()).divide(BIG_DECIMAL_TWO.pow(127));
			BigDecimal V = new BigDecimal("-1").pow(Integer.valueOf(sign)).multiply(E).multiply(bigDecimal_m);
			
			return V.toPlainString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public static float byteToFloat(String bytes){
		return 0;
	}

}
