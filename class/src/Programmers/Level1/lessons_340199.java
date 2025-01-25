//https://school.programmers.co.kr/learn/courses/30/lessons/340199

package Programmers.Level1;

public class lessons_340199 {
    public static void main(String[] args) {
        int[] wallet = {50, 50};
        int[] bill = {100, 241};
        System.out.println(solution(wallet, bill));
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean loopCheck = true;

        while (loopCheck) {
            if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
                loopCheck = false;
            } else if (wallet[1] >= bill[0] && wallet[0] >= bill[1]) {
                loopCheck = false;
            } else {
                int b1 = bill[0];
                int b2 = bill[1];
                if (b1 > b2) {
                    bill[0] = b1 / 2;
                } else {
                    bill[0] = b2/2;
                    bill[1] = b1;
                }
                answer++;
            }
        }
        return answer;
    }

}
