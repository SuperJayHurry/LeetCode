package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class no78 {
    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        trace(nums,0);
        return target;
    }

    public void trace(int[] nums,int start){
        target.add(new ArrayList<>(path));

        for(int i=start; i< nums.length ; ++i){
            path.add(nums[i]);
            trace(nums,i+1);
            path.removeLast();
        }
    }
}
