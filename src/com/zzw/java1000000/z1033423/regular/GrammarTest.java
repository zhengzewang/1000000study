package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarTest {
	
	public static void main(String[] args) {
		testSlash();
		test2();
		test$();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
		test11();
		test12();
		test13();
		test14();
		test15();
		test16();
		test17();
		test18();
		test19();
		test20();
		test21();
		test22();
		test23();
		test24();
		test25();
		test26();
		test27();
		test28();
		test29();
		test30();
	}
	
	/**
	 * \
	 */
	private static void testSlash() {
		System.out.println("	\\:");
		String regex = "\\\\n";
		commonFind(regex, "test\\ntest");
		commonMatch(regex, "test\\ntest");
	}
	
	/**
	 * ^
	 */
	private static void test2(){
		System.out.println("	^:");
		String regex = "^12";
		commonFind(regex, "1298");
		commonFind(regex, "9812");
		commonMatch(regex, "1298");
		commonMatch(regex, "9812");
	}
	
	/**
	 * $
	 */
	private static void test$(){
		System.out.println("	$:");
		String regex = "12$";
		commonFind(regex, "1298");
		commonFind(regex, "9812");
		commonMatch(regex, "1298");
		commonMatch(regex, "9812");
	}
	
	/**
	 * * 0次或多次匹配
	 */
	private static void test4(){
		System.out.println("	*:");
		String regex = "da*";
		commonFind(regex, "daaaaa");
		commonMatch(regex, "daaaaa");
		regex = "(da)*";
		commonFind(regex, "dadadada");
		commonFind(regex, "aaaaa");
		commonMatch(regex, "dadadada");
		commonMatch(regex, "aaaaa");
	}
	
	/**
	 * + 一次或多次匹配
	 */
	private static void test5(){
		System.out.println("	+:");
		String regex = "da*";
		commonFind(regex, "daaaaa");
		commonMatch(regex, "daaaaa");
		regex = "(da)+";
		commonFind(regex, "dadadada");
		commonFind(regex, "aaaaa");
		commonMatch(regex, "dadadada");
	}
	
	/**
	 * ? 零次或一次
	 */
	private static void test6(){
		System.out.println("	?:");
		String regex = "da?";
		commonFind(regex, "daaaaa");
		commonMatch(regex, "daaaaa");
		regex = "(da)?";
		commonFind(regex, "dadadada");
		commonFind(regex, "aaaaa");
		commonMatch(regex, "dadadada");
		commonMatch(regex, "aaaaa");
		commonMatch(regex, "");
	}
	
	/**
	 * {n} n是非负整数，正好匹配n次
	 */
	private static void test7(){
		System.out.println("	{n}:");
		String regex = "z{2}";
		commonFind(regex, "zzz");
		commonMatch(regex, "zzz");
		regex = "(zw){2}";
		commonFind(regex, "zzz");
		commonFind(regex, "zwzwzw");
		commonMatch(regex, "zwzw");
	}
	
	/**
	 * {n,} n是非负整数，至少匹配n次
	 */
	private static void test8(){
		System.out.println("	{n,}:");
		String regex = "z{3,}";
		commonFind(regex, "zzzz");
		commonMatch(regex, "zzzz");
		commonMatch(regex, "zzz");
	}
	
	/**
	 * {n,m} n<=m 
	 */
	private static void test9(){
		System.out.println("	{n,}:");
		String regex = "(zw){3,5}";
		commonFind(regex, "zwzwzwzwzwzw");
		commonMatch(regex, "zwzwzwzw");
	}
	
	/**
	 * ? 非贪心的
	 */
	private static void test10(){
		System.out.println("	{n,}:");
		String regex = "(zw){3,5}?";
		commonFind(regex, "zwzwzwzwzwzw");
		commonMatch(regex, "zwzwzwzw");
	}
	
	/**
	 * . 匹配任何\r\n除外的单个字符
	 */
	private static void test11(){
		System.out.println("	.:");
		String regex = ".*?";
		commonFind(regex, "zwzwzwzwzwzw");
		commonMatch(regex, "zwzwzwzw");
	}
	
	/**
	 * 
	 */
	private static void test12(){
		System.out.println("	(pattern):");
		String regex = "(.*?)(\\d+)@([0-9]{3})(\\.com)";
		commonFind(regex, "zzzw09874@126.com122");
		commonMatch(regex, "zzw09874@126.com");
	}
	
	/**
	 * (?:pattern) 匹配pattern但不捕获该匹配的子表达式
	 */
	private static void test13(){
		System.out.println("	(?:pattern):");
		String regex = "(?:hello)(?:world)";
		commonFind(regex, "helloworld");
		commonMatch(regex, "helloworld");
	}
	
	/**
	 * (?=pattern) 注意理解。不匹配pattern，只是要求匹配的字符串后面必须跟有pattern。
	 */
	private static void test14(){
		System.out.println("	(?=pattern):");
		String regex = "(zzw)(?=helloworld)";
		commonFind(regex, "zzwhelloworld");
		commonFind(regex, "zzwhahaearth");
		regex = "(zzw)(?=helloworld)helloworld";
		commonMatch(regex, "zzwhelloworld");
		regex = "(zzw)(?=hahaearth)helloworld";
		commonMatch(regex, "zzwhelloworld");
	}
	
	/**
	 * (?!pattern)
	 */
	private static void test15(){
		System.out.println("	(?!pattern):");
		String regex = "(zzw)(?!helloworld)";
		commonFind(regex, "zzwhelloworld");
		commonFind(regex, "zzwhahaearth");
		regex = "(zzw)(?!helloworld)";
		commonMatch(regex, "zzw");
		regex = "(zzw)(?!helloworld)hahaearth";
		commonMatch(regex, "zzwhahaearth");
		regex = "(zzw)(?!hahaearth)hahaearth";
		commonMatch(regex, "zzwhahaearth");
	}
	
	/**
	 * x|y  匹配x或y
	 */
	private static void test16(){
		System.out.println("	x|y:");
		String regex = "z|fzw";
		commonFind(regex, "zzw");
		commonFind(regex, "fze");
		commonMatch(regex, "zzw");
		regex = "(z|f)zw";
		commonFind(regex, "zzw");
		commonFind(regex, "fzw");
		commonMatch(regex, "zzw");
	}
	
	/**
	 * [xyz] 匹配包含的任一字符
	 */
	private static void test17(){
		System.out.println("	[xyz]:");
		String regex = "zzw[123]";
		commonFind(regex, "zzw123");
		commonMatch(regex, "zzw2");
	}
	
	/**
	 * [^xyz] 
	 */
	private static void test18(){
		System.out.println("	[^xyz]:");
		String regex = "zzw[^123]";
		commonFind(regex, "zzw");
		commonFind(regex, "zzw2");
		commonFind(regex, "zzw4");
		commonMatch(regex, "zzw");
		commonMatch(regex, "zzw7");
	}
	
	/**
	 * [a-z] 字符范围
	 */
	private static void test19(){
		System.out.println("	[a-z]:");
		String regex = "zzw[x-z]";
		commonFind(regex, "zzwx");
		commonFind(regex, "zzwxy");
		commonMatch(regex, "zzwx");
		commonMatch(regex, "zzwxy");
	}
	
	/**
	 * [^a-z] 
	 */
	private static void test20(){
		System.out.println("	[^a-z]:");
		String regex = "zzw[^x-z]";
		commonFind(regex, "zzw");
		commonFind(regex, "zzwac");
		commonMatch(regex, "zzwx");
		commonMatch(regex, "zzwa");
		commonMatch(regex, "zzwac");
	}
	
	/**
	 * \b 匹配一个字边界，即字与空格键的位置。
	 */
	private static void test21(){
		System.out.println("	\\b:");
		String regex = "lo\\b";
		commonFind(regex, "hello world");
		commonFind(regex, "helloworld");
		regex = "ld\\b";
		commonFind(regex, "hello world");
		commonFind(regex, "hello worlds");
		regex = ".*lo\\b.*ld\\b";
		commonFind(regex, "hello world");
		commonMatch(regex, "hello world");
	}
	
	/**
	 * \B
	 */
	private static void test22(){
		System.out.println("	\\B:");
		String regex = "lo\\B";
		commonFind(regex, "hello world");
		commonFind(regex, "helloworld");
		regex = "ld\\B";
		commonFind(regex, "hello world");
		commonFind(regex, "hello worlds");
		regex = ".*lo\\B.*";
		commonFind(regex, "hello world");
		commonMatch(regex, "helloworld");
	}
	
	/**
	 * \cx
	 */
	private static void test23(){
		System.out.println("	\\cx:");
		String regex = "\\cM";
		commonFind(regex, "\r\n");
	}
	
	/**
	 * \d 数字字符匹配
	 */
	private static void test24(){
		System.out.println("	\\d:");
		String regex = "\\d*[a-z]{2}";
		commonFind(regex, "helloworld");
		commonFind(regex, "123helloworld");
		commonMatch(regex, "123he");
	}
	
	/**
	 * \D 非数字匹配
	 */
	private static void test25(){
		System.out.println("	\\D:");
		String regex = "\\D*";
		commonFind(regex, "123abc");
		commonMatch(regex, "123abc");
		commonMatch(regex, "123");
		commonMatch(regex, "abc");
		commonMatch(regex, "");
	}
	
	/**
	 * \f 换页符匹配
	 */
	private static void test26(){
		System.out.println("	\\f:");
		String regex = "\\f";
		commonFind(regex, "\f");
	}
	
	/**
	 * \n 换行符匹配
	 */
	private static void test27(){
		System.out.println("	\\n:");
		String regex = "\\n";
		commonFind(regex, "\n");
	}
	
	/**
	 * \r 回车符
	 */
	private static void test28(){
		System.out.println("	\\r:");
		String regex = "\\r";
		commonFind(regex, "\r");
	}
	
	/**
	 * \s 匹配任何空白字符
	 */
	private static void test29(){
		System.out.println("	\\s:");
		String regex = "(\\s)*";
		commonFind(regex, "\f\n\r\\t\\v");
	}
	
	/**
	 * \S 匹配任何非空白字符
	 */
	private static void test30(){
		System.out.println("	\\S:");
		String regex = "(\\S)*";
		commonFind(regex, "123\f\n\r\\t\\v");
	}
	
	/**
	 * 匹配到，含有
	 * @param regex
	 * @param str
	 */
	private static void commonFind(String regex, String str){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			System.out.println( regex + ":(" + str + "):" + matcher.group(0) );
			if (matcher.groupCount() >=2 ) {
				System.out.println(matcher.group(2));
			}
		} else {
			System.out.println( regex + ":(" + str + "):no find" );
		}
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
