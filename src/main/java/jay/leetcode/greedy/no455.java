package jay.leetcode.greedy;

import java.util.Arrays;

public class no455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        int childIndex = 0;
        int cookieIndex = 0;
        while(childIndex < g.length && cookieIndex < s.length){
            if(g[childIndex] <= s[cookieIndex]){
                num++;
                childIndex++;
            }
            cookieIndex++;
        }
        return num;
    }
}
