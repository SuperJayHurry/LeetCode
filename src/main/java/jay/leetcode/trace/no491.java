package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class no491 {
    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        trace(nums,0);
        return target;
    }

    public void trace(int[] nums, int startIndex){
        if(path.size()>=2)
            target.add(new ArrayList<>(path));


        int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) ||
                    (used[nums[i] + 100] == 1)) continue;
            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            trace(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] num = {4,4,3,2,1};
        no491 no491 = new no491();
        no491.findSubsequences(num);
    }
}
