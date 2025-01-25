//https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 덧칠하기

package Programmers.Level1;

import java.util.Arrays;

public class lessons_161989 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        // 전체 벽 번호
        for (int i = 1; i <= n; i++) {
            // 훼손된 벽 번호
            for (int count : section) {
                if (i == count && count != section[section.length - 1]) {
                    answer++;
                    i += m;
                } else if (i == count && count == section[section.length - 1]) {
                    answer++;
                    return answer;
                }
            }
        }
        return answer;
    }

}
