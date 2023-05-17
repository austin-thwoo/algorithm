import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length / 2];
        int b = 0;
        for (int num : nums) {
            b += Math.abs(num - a);
        }
        return b;

    }
}







