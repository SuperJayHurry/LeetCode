package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no131 {
    List<List<String>> target = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        trace(s,0);
        return target;
    }

    public void trace(String s,int start){
        if(start==s.length()){
            target.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i < s.length();++i){
            if(isPalindrome(s,start,i)){
                path.add(s.substring(start,i+1));
            }else
                continue;
            trace(s,i+1);
            path.removeLast();
        }
    }

    public boolean isPalindrome(String s,int start,int end){
        while(start!=end && start < end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
