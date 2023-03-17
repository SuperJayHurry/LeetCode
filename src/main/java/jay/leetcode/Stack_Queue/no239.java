package jay.leetcode.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class no239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] target = new int[length-k+1];
        My_queue my_queue = new My_queue();
        for(int i = 0;i < k;++i){
            my_queue.push(nums[i]);
        }
        target[0] = my_queue.peek();
        for(int i = 1;i<= length - k;++i){
            my_queue.remove(nums[i-1]);
            my_queue.push(nums[i+k-1]);
            target[i] = my_queue.peek();
        }
        return target;
    }

    class My_queue{
        LinkedList<Integer> que = new LinkedList<>();
        public void push(int x) {
            while(!que.isEmpty() && que.getLast()<x){
                que.removeLast();
            }
            que.offerLast(x);
        }

        public void remove(int x) {
            if(x==peek()){
                que.removeFirst();
            }
        }

        public int peek() {
            return que.peek();
        }

        public boolean empty() {
            return que.isEmpty();
        }
    }
}
