//https://school.programmers.co.kr/learn/courses/30/lessons/142086

package Programmers.Level1;

public class lessons_142086 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution2(s));
    }

    public static int[] solution(String s) {
        byte[] sByte = s.getBytes();
        int sByteLength = sByte.length;
        int[] answer = new int[sByteLength];

        int byteCount = 0;

        for (int i = 0; i < sByteLength; i++) {
            byte b = sByte[i];

            for (int y = 0; y <= byteCount; y++) {
                if (b == sByte[y]) {
                    answer[byteCount] = i != 0 && i - y != 0 ? i - y : -1;
                }
            }
            byteCount++;
        }

        for (int a : answer) {
            System.out.println(a);
        }


        return answer;
    }

    public static int[] solution2(String s) {
        byte[] sByte = s.getBytes();
        int sByteLength = sByte.length;
        int[] answer = new int[sByteLength];

        int byteCount = 0;

        // 첫번째 자리의 값이 기준값
        for (int i = 0; i < sByteLength; i++) {
            byte b = sByte[i];

            // 기준값 기준 왼쪽에 있는 같은 값의 위치를 알아야 하기 때문에 거꾸로 순회
            for (int y = i; y >= 0; y--) {

                // 값이 같을 때 같은 자리가 아닌 경우, 첫 번째 자리가 아닌 경우 값 삽입
                if (b == sByte[y] && i - y != 0 && i != 0) {
                    answer[byteCount] = i - y;
                    break;
                }
                // 외 모든 경우는 -1 삽입
                  else {
                    answer[byteCount] = -1;
                }
            }
            byteCount++;
        }

        for (int a : answer) {
            System.out.println(a);
        }

        return answer;
    }

}
