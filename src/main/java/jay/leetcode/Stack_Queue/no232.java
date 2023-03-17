package jay.leetcode.Stack_Queue;


import java.util.Stack;

public class no232 {

    Stack<Integer> stack_in = new Stack<>();
    Stack<Integer> stack_out = new Stack<>();

    public void push(int x) {
        stack_in.push(x);
    }

    public int pop() {
        if(!stack_out.empty()){
            return stack_out.pop();
        }
        while(!stack_in.empty()){
            stack_out.push(stack_in.pop());
        }
        return stack_out.pop();
    }

    public int peek() {
        if(!stack_out.empty()){
            return stack_out.peek();
        }
        while(!stack_in.empty()){
            stack_out.push(stack_in.pop());
        }
        return stack_out.peek();
    }

    public boolean empty() {
        if(stack_out.empty()){
            if (stack_in.empty()){
                return true;
            }
        }
        return false;
    }
}
