package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no216 {
    List<List<Integer>> target = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        trace(k,n,1);
        return target;
    }

    public void trace(int k,int n,int start){

        if(path.size() > k || sum > n || (path.size()==k &&sum!=n))
            return;


        if(sum==n && path.size()==k){
            target.add(new ArrayList<>(path));
            return;
        }

        for(int i =start;i<=9 - (k-path.size())+1;++i){
            path.add(i);
            sum+=i;
            trace(k,n,i+1);
            path.removeLast();
            sum-=i;
        }
    }
}
