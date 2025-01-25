//https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 완주하지 못한 선수

package Programmers.Level1;

import java.util.*;

public class lessons_42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "mislav", "ana"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));

        for (String c : completion) {
            if (participantList.contains(c)) {
                participantList.remove(c);
            }
        }
        return participantList.get(0);
    }

}
