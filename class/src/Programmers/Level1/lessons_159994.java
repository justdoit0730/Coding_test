//https://school.programmers.co.kr/learn/courses/30/lessons/159994

package Programmers.Level1;

public class lessons_159994 {
    public static void main(String[] args) {
        String[] goal = {"i", "want", "to", "drink", "water"};
        String[] cards1 = {"i", "water", "drink"};
        String[] card2 = {"want", "to"};

        System.out.println(solution(cards1, card2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Count = 0;
        int cards2Count = 0;

        // 형변환 해서 card1, card2 확인한 요소 지우는 방식으로 풀려고 했으나, 그냥 주어진 형식으로 풀기로 결정.
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1[cards1Count])) {
                cards1Count = cards1.length -1 == cards1Count ? cards1Count : ++cards1Count;
            } else if (goal[i].equals(cards2[cards2Count])) {
                cards2Count = cards2.length -1 == cards2Count ? cards2Count : ++cards2Count;
            } else {
                return  "No";
            }
        }
        return "Yes";
    }

}
