package Programmers;

import java.math.*;
import java.util.*;

public class lessons_120886 {
	public static void main(String[] args) {
		String before="abcdef";
		String after="bdfeca";
		int answer =0;
		String s= "";
		
		String[]b=before.split("");
		String[]a=after.split("");
		Arrays.sort(b);
		Arrays.sort(a);
		String B=""; String A="";
		for(int i=0;i<b.length;i++) {
			B+=b[i]; A+=a[i];
		}
		if(B.equals(A)) {
			answer=1;
		}else {answer=0;}
		System.out.println(answer);
	}
}