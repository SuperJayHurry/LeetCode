package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no77 {
    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        trace(n,k,1);
        return target;
    }

    public void trace(int n,int k ,int startIndex){
        if(path.size()==k){
            target.add(new ArrayList<>(path));
            return;
        }

        for(int i = startIndex;i <= n - (k-path.size()) +1;++i){
            path.add(i);
            trace(n,k,i+1);
            path.removeLast();
        }
    }
}
