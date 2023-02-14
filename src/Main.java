import programers.Jan26_2023;

import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Practice practice = new Practice();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(practice.spiralOrder(matrix).stream().collect(Collectors.toList()));

    }
}
