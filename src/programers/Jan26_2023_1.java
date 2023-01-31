package programers;

import java.util.Arrays;

public class Jan26_2023_1 {

    class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            int i = sides[2] < (sides[0] + sides[1]) ? 1 : 2;

            return i;
        }
    }


}
