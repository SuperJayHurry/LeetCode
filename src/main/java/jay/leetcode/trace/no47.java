package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class no47 {
    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new int[nums.length];
        Arrays.sort(nums);
        trace(nums);
        return target;
    }

    public void trace(int[] nums){
        if(path.size()== nums.length){
            target.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i < nums.length;++i){
            if(used[i]==1)
                continue;
            path.add(nums[i]);
            used[i]=1;
            trace(nums);
            path.removeLast();
            used[i]=0;
            while(i < nums.length-1 && nums[i]==nums[i+1])
                i++;
        }
    }
}
