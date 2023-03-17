package jay.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class no94 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    //相当于自己实现递归(迭代方法)
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> target = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> treeNodes = new Stack<>();
        while(!treeNodes.empty() || cur != null){
            if(cur!=null){
                treeNodes.push(cur);
                cur = cur.left;
            }else {
                cur = treeNodes.pop();
                target.add(cur.val);
                cur = cur.right;
            }
        }
        return target;
    }
}
