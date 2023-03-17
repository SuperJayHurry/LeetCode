package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class no90 {

    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        trace(nums, 0);
        return target;
    }

    public void trace(int[] nums, int startIndex){
        target.add(new ArrayList<>(path));

        for(int i = startIndex; i< nums.length;++i){
            path.add(nums[i]);
            trace(nums, i+1);
            path.removeLast();
            while(i+1 < nums.length && nums[i]==nums[i+1])
                i++;
        }
    }


    public static void main(String[] args) {
        no90 no90 = new no90();
        int[] nums = {1,2,2};
        no90.subsetsWithDup(nums);
        System.out.println(no90.target);
    }
}
