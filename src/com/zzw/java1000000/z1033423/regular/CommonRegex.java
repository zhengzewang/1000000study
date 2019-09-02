package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonRegex {
	
	public static void main(String[] args) {
		email();
		System.out.println();
		mobile();
		System.out.println();
		url();
		System.out.println();
		IDCard();
	}
	
	/**
	 * 邮箱的正则表达式
	 * ^[\w-]+@[\w-]+(\.[\w-]+)+$
	 */
	private static void email(){
		String regex = "^[\\w-]+@[\\w-]+(\\.[\\w-]+)+$";
		commonMatch(regex, "123456@qq.com");
		commonMatch(regex, "zzw111@126.com");
		commonMatch(regex, "zzw@hd123.com");
		commonMatch(regex, "zzwhd123.com");
		commonMatch(regex, "zzw-123@qq.com.cn");
		commonMatch(regex, "1@1");
	}
	
	/**
	 * 手机的正则表达式
	 * ^1[34578]\d{9}$
	 */
	private static void mobile(){
		String regex = "^1[34578]\\d{9}$";
		commonMatch(regex, "15388951793");
		commonMatch(regex, "17621963326");
		commonMatch(regex, "177621963326");
		commonMatch(regex, "1556548962");
		commonMatch(regex, "55645212365");
		commonMatch(regex, "12756541236");
	}

	/**
	 * url的正则表达式
	 * ^(http|https|ftp)://([\w-]+\.)+[\w-]+(:\d+)?((/[\w-]+)+(.[\w-]+)?)?/?(\?([\w-]+=[\w-%]+)(&([\w-]+=[\w-%]+))*)?(#.*)*$
	 */
	private static void url(){
		String regex = "^(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(:\\d+)?((/[\\w-]+)+(.[\\w-]+)?)?/?(\\?([\\w-]+=[\\w-%]+)(&([\\w-]+=[\\w-%]+))*)?(#.*)*$";
		commonMatch(regex, "http://mail.126.com/");
		commonMatch(regex, "http://127.0.0.1:51004/view/26");
		commonMatch(regex, "https://www.cnblogs.com/lzq198754/p/5780340.html");
		commonMatch(regex, "http://fanyi.baidu.com/#en/zh/worlds");
		commonMatch(regex, "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=baidu&wd=%E9%82%AE%E7%AE%B1%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F&oq=%25E9%2582%25AE%25E6%2594%25BF%25E7%25BC%2596%25E7%25A0%2581%25E6%25AD%25A3%25E5%2588%2599%25E8%25A1%25A8%25E8%25BE%25BE%25E5%25BC%258F&rsv_pq=8fae7713000052e4&rsv_t=4f1fnuSj26nCqMeGVg%2BAxqWdmjWI67nD%2FOJJVkP0rzxdyLQXWMXSVhU6FxE&rqlang=cn&rsv_enter=1&inputT=5&rsv_sug3=28&rsv_sug1=23&rsv_sug7=100&bs=%E9%82%AE%E6%94%BF%E7%BC%96%E7%A0%81%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F");
		commonMatch(regex, "http://blog.csdn.net/make164492212/article/details/51656638");
	}
	
	/**
	 * 18位身份证正则表达式
	 * ^\d{6}(18|19|20)\d{2}(0\d|1[012])([012]\d|3[01])\d{3}(\d|x|X)$
	 */
	private static void IDCard(){
		String regex = "^\\d{6}(18|19|20)\\d{2}(0\\d|1[012])([012]\\d|3[01])\\d{3}(\\d|x|X)$";
		commonMatch(regex, "362331199310204611");
		commonMatch(regex, "34102319930912252x");
		commonMatch(regex, "34102319930912252");//少了一位
		commonMatch(regex, "3623311993102046111");//多了一位
		commonMatch(regex, "362331199313204611");//没有13月
		commonMatch(regex, "362331199310324611");//不能超过32号
		commonMatch(regex, "15388951793");
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
			System.out.println( regex + ":(" + str + "):match" );
		} else {
			System.out.println( regex + ":(" + str + "):not match" );
		}
	}
	
}
