package Programmers.Level1;

import java.util.*;

public class lessons_92334 { 
	public static void main(String[] args) {
		String[] id_list= {"muzi", "frodo", "apeach", "neo"};
		String[] report= {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k=2;
		
		int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>(); 		//1
        Map<String, Integer> idxMap = new HashMap<>();
 
        for (int i = 0; i < id_list.length; i++) {			//2
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }
 
        for (String s : report) {					//3
            String[] str = s.split(" ");
            String user = str[0];
            String singo = str[1];
            map.get(singo).add(user);
        }	
 
        for (int i = 0; i < id_list.length; i++) {			//4
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }
		System.out.println(Arrays.toString(answer));
	}
}