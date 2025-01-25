//https://school.programmers.co.kr/learn/courses/30/lessons/147355

package Programmers.Level1;

public class lessons_147355 {
    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        // 형변환 X
        System.out.println(solution3(t, p));

        // 형변환 O
//        System.out.println(solution2(t, p));
    }

    public static int solution1Test(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        int answer = 0;

        for (int i = 0; i < tLength; i++) {
            // p 길이 만큼의 t 값에 대해서 앞자리가 0인 값을 전부 제거 -> 정규식 사용
            String tReplace = t.substring(i, pLength + i).replaceFirst("^0+", "");
            System.out.println("tReplace : " + tReplace);

            // 숫자값인 문자열 비교 매서드 compareTo()
            // 기준값.compareTo(비교값) : byte 배열화 -> char 형태 변환 -> 뺴기 --> 양수 : 기준값이 더 큰 경우, 0 : 같은 경우, 음수 : 비교값이 더 큰경우

            // 전위 후위 연산자 확인
            System.out.println("compare : " + tReplace.compareTo(p));
            answer = tReplace.compareTo(p) <= 0 ? ++answer : answer;

            if (t.length() == pLength + i) {
                break;
            }
        }

        System.out.println("Result!");
        return answer;
    }

    public static int solution1(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        int answer = 0;

        for (int i = 0; i < tLength; i++) {
            String tReplace = t.substring(i, pLength + i).replaceFirst("^0+", "");
            System.out.println("tReplace : " + tReplace);

            System.out.println("compare : " + tReplace.compareTo(p));
            answer = tReplace.compareTo(p) <= 0 ? ++answer : answer;

            if (t.length() == pLength + i) {
                break;
            }
        }

        System.out.println("Result!");
        return answer;
    }

    public static int solution3(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        Long longP = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= tLength - pLength; i++) {
            Long longT = Long.parseLong(t.substring(i, pLength + i));
            answer = longT <= longP ? ++answer : answer;
        }

        return answer;
    }

}
