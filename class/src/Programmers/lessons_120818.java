package Programmers;

import java.util.*;

public class lessons_120818 { 
	public static void main(String[] args) {
		int price = 90000;
        if(100000<=price&&price<300000) {
			price*=0.95;
		}else if(300000<=price&&price<500000) {
			price*=0.9;
		}else if(price>=500000){
			price*=0.8;
		}
        System.out.println(price);
		
	}
}