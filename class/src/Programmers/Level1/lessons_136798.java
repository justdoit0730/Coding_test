//https://school.programmers.co.kr/learn/courses/30/lessons/136798

package Programmers.Level1;

public class lessons_136798 {
    public static void main(String[] args) {
        int number = 100000;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number, limit, power));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = divisorProcess2(i);
            answer += (divisorCount <= limit) ? divisorCount : power;
        }
        return answer;
    }

    // 속도 제한 X
    private static int divisorProcess1(int number) {
        int divisorCount = 0;
        for (int i = 1; i <= number; i++) {
            divisorCount = number % i == 0 ? ++divisorCount : divisorCount;
        }
        return divisorCount;
    }

    // 약수의 갯수는 제곱근 으로 계산 하는 게 훨씬 빠르다.
    private static int divisorProcess2(int number) {
        int divisorCount = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) divisorCount++;
            else if (number % i == 0) divisorCount += 2;
        }
        return divisorCount;
    }

}
