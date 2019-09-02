package com.zzw.java1000000.z1011130.loop.Continue;

public class ContinueDemo {
	
	public static void main(String[] args) {
		int i = 0;
		while(i<10){
			System.out.println("while:"+i);
			i++;
			do{
				i++;
				if(i%2 == 0)
					continue;
				System.out.println("do:"+i);
			}while(i<5);
		}
		int j=0;
		for(; j<10 ; j++){
			for(;j<4;){
				j++;
				if(j%3 == 0)
					continue;
				System.out.println("innerfor:"+j);
			}
			if(j%2==0)
				continue;
			System.out.println("for:"+j);
		}
		System.out.println("j:"+j);
	}

}
