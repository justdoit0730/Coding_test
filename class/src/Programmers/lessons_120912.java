package Programmers;

import java.util.*;

public class lessons_120912 { 
	public static void main(String[] args) {
		int [] array= {7, 17, 77};
		int answer =0;
		//고정
		
		String [] list = new String[array.length];
		for(int i=0; i<array.length;i++) {
			list[i]= Integer.toString(array[i]);
		}
		
		for(int i=0; i<list.length;i++) {
			for(int y=0; y<list[i].length();y++) {
				char c = list[i].charAt(y);
				if(c==55) {
					answer++;
				}
			}
		}
	System.out.println(answer);
		
	}
}