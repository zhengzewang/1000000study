package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		//邮箱
		String regex = "^[\\w-]+@[\\w-]+(\\.[\\w-]+)+$";
		commonMatch(regex, "123456@qq.com");//match
		commonMatch(regex, "error@error");//not match
		//手机
		regex = "^1[34578]\\d{9}$";
		commonMatch(regex, "15388951793");//match
		commonMatch(regex, "77621963326");//not match
		//url
		regex = "^(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(:\\d+)?((/[\\w-]+)+(.[\\w-]+)?)?/?(\\?([\\w-]+=[\\w-%]+)(&([\\w-]+=[\\w-%]+))*)?(#.*)*$";
		commonMatch(regex, "http://127.0.0.1:51004/view/26");//match
		commonMatch(regex, "http://www.baidu.com/.html");//not match
		//身份证
		regex = "^\\d{6}(18|19|20)\\d{2}(0\\d|1[012])([012]\\d|3[01])\\d{3}(\\d|x|X)$";
		commonMatch(regex, "362331199310204611");//match
		commonMatch(regex, "362331199313204611");//没有13月//not match
	}
	/**
	 * 完全匹配
	 * @param regex
	 * @param str
	 */
	private static void commonMatch(String regex, String str){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches()) {
			System.out.println( regex + ":" + str + ":match" );
		} else {
			System.out.println( regex + ":" + str + ":not match" );
		}
	}
}
