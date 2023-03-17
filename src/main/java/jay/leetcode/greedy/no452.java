package jay.leetcode.greedy;

import java.util.Arrays;

public class no452 {
    public int findMinArrowShots(int[][] points) {
        /**
         * 时间复杂度 : O(NlogN)  排序需要 O(NlogN) 的复杂度
         * 空间复杂度 : O(logN) java所使用的内置函数用的是快速排序需要 logN 的空间
         */
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int arrowSum = 1;

        for(int i = 1 ; i < points.length ;++i){
            if(points[i][0] > points[i-1][1])
                arrowSum++;
            else
                points[i][1] = Math.min(points[i][1], points[i-1][1]);
        }

        return arrowSum;
    }
}
