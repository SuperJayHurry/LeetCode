package jay.leetcode.Stack_Queue;

import java.util.Stack;

public class no1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        String target = "";
        char c;
        for(int i = 0;i < s.length();++i){
            c = s.charAt(i);
            if(stack.empty()){
                stack.push(c);
            }
            else {
                if(stack.peek()==c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        for(char temp : stack){
            target = target+String.valueOf(temp);
        }
        return target;
    }

    public static void main(String[] args) {
        no1047 no1047 = new no1047();
        System.out.println(no1047.removeDuplicates("abbaca"));
    }
}
