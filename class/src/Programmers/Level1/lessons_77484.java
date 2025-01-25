//https://school.programmers.co.kr/learn/courses/30/lessons/77484

package Programmers.Level1;

import java.util.Arrays;

public class lessons_77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(lottos, win_nums));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lowRank = 0;
        int count = 0;
        int highRank = 0;

        for (int lottosNum : lottos) {
            if (lottosNum == 0) {
                count++;
                continue;
            }

            if (Arrays.stream(win_nums).anyMatch(num -> num == lottosNum)) {
                lowRank++;
            }
        }

        highRank = lowRank + count;

        answer[0] = getRank(highRank);
        answer[1] = getRank(lowRank);

        return answer;
    }

    public static int getRank(int rank) {
        switch (rank) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }

}
