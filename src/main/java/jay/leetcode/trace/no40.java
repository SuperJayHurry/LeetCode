package jay.leetcode.trace;

import java.util.*;

public class no40 {
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
            trace(candidates,target,i+1);
            path.removeLast();
            sum-=candidates[i];
            while(i+1 <candidates.length &&candidates[i]==candidates[i+1])
                i++;
        }
    }
}
