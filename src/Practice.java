import java.util.*;
import java.util.stream.Collectors;

public class Practice {



    public int maxProfit(int[] prices) {
        int cost = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                cost += prices[i] - prices[i-1];
            }
        }
        return cost;
    }




}




