package com.zzw.java1000000.z1011698.Unicode.demo;

/**
 * 字符串与unicode码之间互相转换
 * @author zhengzewang
 *
 */
public class Translate {
	
	/**
	 * 字符串转Unicode码
	 * @param str
	 * @return
	 */
	public static String convert(String str){ 
		str = (str == null ? "" : str); 
		String tmp; 
		StringBuffer sb = new StringBuffer(1000); 
		char c; 
		int i, j; 
		sb.setLength(0); 
		for (i = 0; i < str.length(); i++){
			c = str.charAt(i); 
			sb.append("\\u"); 
			j = (c >>>8); //取出高8位 
			tmp = Integer.toHexString(j); 
			if (tmp.length() == 1) 
			sb.append("0"); 
			sb.append(tmp); 
			j = (c & 0xFF); //取出低8位 
			tmp = Integer.toHexString(j); 
			if (tmp.length() == 1) 
			sb.append("0"); 
			sb.append(tmp);
		} 
		return (new String(sb)); 
	} 
	
	
	/**
	 * Unicode码转字符串
	 * @param str
	 * @return
	 */
	public static String revert(String str) { 
		str = (str == null ? "" : str); 
		if (str.indexOf("\\u") == -1)//如果不是unicode码则原样返回 
			return str; 
	
		StringBuffer sb = new StringBuffer(1000); 
	
		for (int i = 0; i < str.length() - 6;) {
			String strTemp = str.substring(i, i + 6); 
			String value = strTemp.substring(2); 
			int c = 0; 
			for (int j = 0; j < value.length(); j++){
				char tempChar = value.charAt(j); 
				int t = 0; 
				switch (tempChar){ 
					case 'a': 
					t = 10; 
					break; 
					case 'b': 
					t = 11; 
					break; 
					case 'c': 
					t = 12; 
					break; 
					case 'd': 
					t = 13; 
					break; 
					case 'e': 
					t = 14; 
					break; 
					case 'f': 
					t = 15; 
					break; 
					default: 
					t = tempChar - 48; 
					break; 
				}
				c += t * ((int) Math.pow(16, (value.length() - j - 1))); 
			} 
			sb.append((char) c); 
			i = i + 6; 
		} 
		return sb.toString(); 
	}

}
