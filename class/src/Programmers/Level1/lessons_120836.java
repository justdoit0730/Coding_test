package Programmers.Level1;

import java.util.*;

public class lessons_120836 { 
	public static void main(String[] args) {
		int n =20;
		int answer =0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				answer++;
			}
		}
		System.out.println(answer+1);
	}
}