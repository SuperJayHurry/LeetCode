package jay.leetcode.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class no746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] pay = new int[cost.length+1];
        for(int i = 2 ; i <= cost.length; ++i){
            pay[i] = Math.min(pay[i-1] + cost[i-1], pay[i-2]+cost[i-2]);
        }
        return pay[cost.length];
    }
}
