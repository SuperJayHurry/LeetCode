package jay.leetcode.greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no763 {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        for(int i = 0 ; i <s.length() ; ++i)
            arr[s.charAt(i) - 97] = i ;

        List<Character> path  = new ArrayList<>();
        List<Integer> target = new ArrayList<>();
        int maxIndex = 0;
        int index = 0;
        int temp = 0;
        while(index < s.length()){
            maxIndex = Math.max(arr[s.charAt(index) - 97],maxIndex);
            if(index == maxIndex){
                if(target.isEmpty())
                    target.add(index+1);
                else
                    target.add(index - temp);
                temp = index;
            }
            index++;
        }

        return target;
    }
}
