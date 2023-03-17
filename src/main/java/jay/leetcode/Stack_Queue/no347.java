package jay.leetcode.Stack_Queue;


import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

//使用优先队列 (基于大顶堆实现)
public class no347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] target = new int[k];
        for(Integer i: nums){
            if(map.get(i)==null)
                map.put(i,1);
            else {
                map.put(i,map.get(i)+1);
            }
        }
        PriorityQueue<int[]> queue =new PriorityQueue<>((pair1, pair2)->pair2[1]-pair1[1]);    //大顶堆创建方法

        Set<Integer> keySet = map.keySet();
        for(Integer i: keySet){
            queue.add(new int[]{i,  map.get(i)});
        }
        for(int i = 0;i< k;++i){
            target[i] = queue.poll()[0];
        }
        return target;
    }
    
}
