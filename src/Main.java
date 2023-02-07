import ect.LinkedList;
import litecode.Solution;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Solution solution= new Solution();
        System.out.println("----------1------------");
        Boolean c=solution.isValid("{[]}");
        System.out.println("----------2------------");
        Boolean b=solution.isValid("((");
        System.out.println("----------3------------");
        Boolean s=solution.isValid("()");
        System.out.println("----------4------------");
        Boolean a=solution.isValid("){");
        System.out.println("----------5------------");
        Boolean d=solution.isValid("(){}}{");
        System.out.println("----------6------------");
        Boolean e=solution.isValid("[([]])");

        System.out.println("----------result------------");
        System.out.println("1:"+c);
        System.out.println("2:"+b);
        System.out.println("3:"+s);
        System.out.println("4:"+a);
        System.out.println("5:"+d);
        System.out.println("6:"+e);


    }
}





