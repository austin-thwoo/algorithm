package backjoon;

import java.util.Scanner;

public class d {
    public void cla() {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > 0) {
            if (a < 0) {
                result += 1;

            }
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
