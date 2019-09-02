package com.zzw.java1000000.z1011130.loop.Break;

public class BreakDemo {
	
	public static void main(String[] args) {
		int i = 0;
		while(i<5){
			System.out.println("while:"+i);
			i++;
			do{
				System.out.println("do:"+i);
				i++;
				if(i>2)
					break;
			}while(true);
		}
		int j=0;
		for(; j<1000 ; j++){
			System.out.println("for:"+j);
			for(;;){
				System.out.println("innerfor:"+j);
				j++;
				if(j>3)
					break;
			}
			if(j>5)
				break;
		}
		System.out.println("j:"+j);
	}

}
