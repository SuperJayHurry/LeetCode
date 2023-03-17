package jay.leetcode.trace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class no332 {
    int[] used;
    List<String>target;
    LinkedList<String> path = new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        path.add("JFK");
        used = new int[tickets.size()];
        trace(tickets);
        return target;
    }

    public void trace(List<List<String>> tickets){
        if(path.size()== tickets.size()+1){
            target = new ArrayList<>(path);
            return;
        }

        for (int i=0; i < tickets.size();++i){
            if(target!=null)
                return;
            if(used[i]!=1 && tickets.get(i).get(0).equals(path.getLast())){
                path.add(tickets.get(i).get(1));
                used[i] = 1;
                trace(tickets);
                used[i] = 0;
                path.removeLast();
            }
        }
    }
}
