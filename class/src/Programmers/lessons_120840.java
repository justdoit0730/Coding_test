package Programmers;

import java.math.*;
import java.util.*;

public class lessons_120840 { 
	public static void main(String[] args) {
		int balls =5;
		int share =3;
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		while(balls-share>0) {
			BigInteger B = BigInteger.valueOf(balls);
			BigInteger S = BigInteger.valueOf(share);
			a= a.multiply(B); 
			b = b.multiply(B.subtract(S));
			balls--;
		}
		a = (a.divide(b));
		int answer = a.intValue();
		System.out.println(answer);
	}
}