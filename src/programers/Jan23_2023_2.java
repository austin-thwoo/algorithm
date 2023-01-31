package programers;

public class Jan23_2023_2 {

    class Solution {
        public int solution(int n) {

            int answer = 0;
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                answer += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            return answer;
        }
    }
}
