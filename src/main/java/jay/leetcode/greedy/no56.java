package jay.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class no56 {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));

        int start = intervals[0][0];
        int maxRight = intervals[0][1];
        for(int i = 1; i < intervals.length ; ++i){
            if(intervals[i][0] > maxRight){
                list.add(new int[]{start , maxRight});
                start = intervals[i][0];
                maxRight = intervals[i][1];
            }
            else
                maxRight = Math.max(intervals[i][1], maxRight);
        }

        list.add(new int[]{start,maxRight});
        return list.toArray(new int[list.size()][]);
    }
}
