import programers.Jan26_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Practice practice = new Practice();
        int[] price ={7,1,5,3,6,4};
        int a =practice.maxProfit(price);
        System.out.println(a);




    }



//    int[] res = new int[2];
//    Hashtable<Integer,Integer> ht = new Hashtable<>();
//    for(int i = 0; i < nums.length; i++){
//        if(ht.containsKey(target-nums[i])){
//            res[0] = i;
//            res[1] = ht.get(target-nums[i]);
//            return res;
//        }
//        ht.put(nums[i],i);
//    }
//        return res;
//}
}
