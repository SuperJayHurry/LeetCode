package jay.leetcode.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class no225 {


    Queue<Integer> queue = new LinkedList<>();
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        //移动除了 A 的其它数
        while (size-- > 1)
            queue.offer(queue.poll());
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
