package com.zzw.java1000000.z1011084.branching.Switch;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		System.out.println(countMontDays(2,2100));
		
		Week week = Week.THURSDAY;
		switch (week) {
		case SUNDAY:
			System.out.println(Week.SUNDAY.toString());
		case MONDAY:
			System.out.println(Week.MONDAY.toString());
		case THUSDAY:
			System.out.println(Week.THUSDAY.toString());
		case WEDNESDAY:
			System.out.println(Week.WEDNESDAY.toString());
		case THURSDAY:
			System.out.println(Week.THURSDAY.toString());
		case FRIDAY:
			System.out.println(Week.FRIDAY.toString());
		default:
			System.out.println(Week.SATURDAY.toString());
			break;
		}
		
	}
	
	enum Week{
		SUNDAY,MONDAY,THUSDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	
	/**
	 * 判断该月份有多少天
	 * @param month
	 * @param year
	 * @return
	 */
	private static int countMontDays(int month,int year) {
		int days = 30;
		switch (month) {
		case 2:
			days = year%4==0 && year%100!=0 || year%400 == 0 ? 29 : 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		default:
			break;
		}
		return days;
	}

}
