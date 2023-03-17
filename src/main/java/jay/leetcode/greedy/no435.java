package jay.leetcode.greedy;

import java.util.Arrays;

public class no435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int removeSum = 0;
        for(int i =1; i < intervals.length; ++i){
            if(intervals[i][0] < intervals[i-1][1]){
                removeSum++;
                intervals[i][1] = Math.min(intervals[i-1][1],intervals[i][1]);
            }

        }

        return removeSum;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        no435 no435 = new no435();
        no435.eraseOverlapIntervals(intervals);
    }
}
