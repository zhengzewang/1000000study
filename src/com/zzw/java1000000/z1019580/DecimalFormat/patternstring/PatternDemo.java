package com.zzw.java1000000.z1019580.DecimalFormat.patternstring;

import com.zzw.java1000000.z1019580.DecimalFormat.DecimalFormat.DecimalFormatDemo;

public class PatternDemo {
	public static void main(String[] args) {
		//先用第一种方法测试前五个
		DecimalFormatDemo.SimpleFormat("00000000", 123456.789);//"0"
		DecimalFormatDemo.SimpleFormat("0000.00", 123456.789);//"0"
		DecimalFormatDemo.SimpleFormat("########.####", 123456.789);//"#"、"."
		DecimalFormatDemo.SimpleFormat("####.####", 123456.789);//"#"、"."
		DecimalFormatDemo.SimpleFormat("00000,000.0000", 123456.789);//","、"0"、"."
		DecimalFormatDemo.SimpleFormat("000,00,000.0000", 123456.789);//","、"0"、"."
		DecimalFormatDemo.SimpleFormat("-00000000.0000", 123456.789);//"-"、"0"、"."
		//用第二种方法测试后面的几个
		DecimalFormatDemo.useApplyPatternFormat("00.00E0000", 123456789);//"E"
		DecimalFormatDemo.useApplyPatternFormat("00000000000.00E0000", 123456789);//"E"
		DecimalFormatDemo.useApplyPatternFormat("#.##%", 0.123456);//"%"
		DecimalFormatDemo.useApplyPatternFormat("000.###\u2030", 0.123456);//"\u2030"
		DecimalFormatDemo.useApplyPatternFormat("\u00A4#.##", 123456.789);
		DecimalFormatDemo.useApplyPatternFormat("'#'#.###", 123456.789);//"."
		DecimalFormatDemo.useApplyPatternFormat("-##.##;%", 123456.789);
	}
}
