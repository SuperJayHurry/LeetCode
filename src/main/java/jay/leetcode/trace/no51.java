package jay.leetcode.trace;

import java.util.*;

public class no51 {
    List<List<String>> target = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    int used[][];
    public List<List<String>> solveNQueens(int n) {
        used = new int[n][n];
        trace(n);
        return target;
    }

    public void trace(int n){
        if(path.size()==n){
            target.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i < n;++i){
            if(used[path.size()][i]==1)
                continue;
            HashMap<Integer,List<Integer>> tool = new HashMap<>();
            path.add(make(i,n));
            control(i,n,tool);
            trace(n);
            path.removeLast();
            controlReverse(i,n,tool);
        }
    }

    public String make(int index,int n){
        StringBuilder target = new StringBuilder();
        for(int i=0; i < index ;++i)
            target.append(".");
        target.append("Q");
        for(int i=index+1; i < n; ++i)
            target.append(".");
        return target.toString();
    }

    public void control(int index ,int n,Map<Integer,List<Integer>> tool){
        for(int i = 0; i < n; ++i){
            ArrayList<Integer> list = new ArrayList<>();
            if(used[i][index] == 0) {
                used[i][index] = 1;
                list.add(index);
            }
            int move = path.size() - i -1;
            int fixIndex = index - move;
            if(fixIndex >= 0 && fixIndex < n)
                if(used[i][fixIndex] ==0) {
                    used[i][fixIndex] = 1;
                    list.add(fixIndex);
                }
            move = i - path.size() +1;
            fixIndex = index - move;
            if(fixIndex >= 0 && fixIndex < n)
                if(used[i][fixIndex] ==0) {
                    used[i][fixIndex] = 1;
                    list.add(fixIndex);
                }
            tool.put(i, list);
        }
    }

    public void controlReverse(int index, int n,Map<Integer,List<Integer>> tool){
        Set<Integer> integers = tool.keySet();
        for(Integer i : integers){
            for(Integer obj : tool.get(i)){
                used[i][obj] = 0;
            }
        }
    }


    public static void main(String[] args) {
        no51 no51 = new no51();
        System.out.println(no51.solveNQueens(4));
    }
}