package Programmers;

import java.util.*;

public class lessons_42842 { 
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		
		int []answer =new int [2];
		int a=1;int b;

		for(int i =a; i<=(int)Math.sqrt(yellow);i++) {
			if(yellow%i==0) {
				a=i;
				b=yellow/i;
				if(a+b==(brown-4)/2) {
					answer[0]=b+2;
					answer[1]=a+2;
				}
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
				
	}
}
