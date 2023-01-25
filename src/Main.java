import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int result = 1;////
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > 0) { // 1 //2
            if (a < 0) {
                result += 1;
///////////////
            }/////
            System.out.println(result);
            return;
        }
        if (a < 0) {
            result += 2;
            System.out.println(result);
            return;
        }
        System.out.println(4);
        return;


    }

}