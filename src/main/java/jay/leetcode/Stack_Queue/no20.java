package jay.leetcode.Stack_Queue;

import java.util.Stack;

public class no20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c;
        char cmp;
        for(int i=0; i < s.length();++i){
            c = s.charAt(i);
            if(c=='(' || c== '{' || c == '['){
                if(c=='(')
                    stack.push(')');
                else if(c=='{')
                    stack.push('}');
                else
                    stack.push(']');
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                cmp = stack.pop();
                if(cmp!=c){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()";
        no20 no20 = new no20();
        System.out.println(no20.isValid(s));
    }
}
