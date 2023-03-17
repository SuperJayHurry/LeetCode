package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class no39 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        trace(candidates,target,0);
        return result;
    }

    public void trace(int[] candidates, int target,int start){
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=start; i < candidates.length && sum+candidates[i]<=target;++i){
            path.add(candidates[i]);
            sum += candidates[i];
            trace(candidates,target,i);
            path.removeLast();
            sum-=candidates[i];
        }
    }

    public static void main(String[] args) {
        no39 no39 = new no39();
        int[] arr = {8,7,4,3};
        no39.combinationSum(arr,11);
    }
}
