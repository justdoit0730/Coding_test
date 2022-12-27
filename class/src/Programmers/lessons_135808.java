package Programmers;

import java.math.*;
import java.util.*;

public class lessons_135808 {
	public static void main(String[] args) {
		int k = 4; int m =3; int []score= {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}; int answer =0;
		
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0; i<score.length;i++) {
			list.add(score[i]);
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		int [] s = new int [list.size()/m];
		int cnt =0;
		for(int i=0; i<s.length; i++) {
			for(int y=cnt; y<list.size(); y++) {
				s[i]=Math.min(list.get(y), 9);
				cnt++;
				if(cnt%m==0) {break;}
			}
			if(list.size()-cnt<m) {break;}
		}
		System.out.println(Arrays.toString(s));
		
		for(int i=0; i<s.length;i++) {
			answer += s[i]*m;
		}
		System.out.println(answer);
	}
}