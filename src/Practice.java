import java.util.*;
import java.util.stream.Collectors;

public class Practice {


    public List<Integer> spiralOrder(int[][] matrix) {

//         int[] result = new int[matrix.length+matrix[0].length];
        List<Integer> result = new ArrayList();
        int size=matrix.length+matrix[0].length;

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int count = 0;
//         public void addResult (int r){
//          result[count]=r;
//          count++;
//        }
        while (top<=bottom && left<=right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                System.out.println("1for" + count);
                count++;
            }

            top++;


//l r
//xxx
//000  t
//000  b
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
                System.out.println("2for" + count);
                count++;
            }

            right--;


//lr
//xxx
//00x  t
//00x  b
            if (top<=bottom) {
                for (int k = right; k >= left; k--) {
                    result.add(matrix[bottom][k]);
                    System.out.println("3for" + count);
                    count++;

                }
                System.out.println("??" + result.stream().collect(Collectors.toList()));
                bottom--;


            }
//lr
//xxx
//00x t b
//xxx
            if (left<=right) {
                for (int l = bottom; l >= top; l--) {
                    result.add(matrix[l][left]);
                    System.out.println("4for" + count);
                    System.out.println("??" + result.stream().collect(Collectors.toList()));
                    count++;
                }
                left++;


            }
//lr
//xxx
//x0x t b
//xxx
        }



        return result;
    }

}
