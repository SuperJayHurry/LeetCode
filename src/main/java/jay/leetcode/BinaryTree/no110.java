package jay.leetcode.BinaryTree;

import java.lang.management.ManagementFactory;

public class no110 {
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

    public boolean isBalanced(TreeNode root) {
        int leftHeight,rightHeight = 0;
        if(root==null)
            return true;
        leftHeight = getHeight(root.left);
        rightHeight = getHeight(root.right);
        if(leftHeight>=100000)
            return false;
        if(Math.abs(leftHeight - rightHeight)>1)
            return false;
        return true;
    }

    public static int getHeight(TreeNode root){
        int leftHeight,rightHeight = 0;
        if(root==null)
            return 0;
        leftHeight = getHeight(root.left);
        rightHeight = getHeight(root.right);
        if(Math.abs(leftHeight - rightHeight)>1)
            return 100000;
        return Math.max(leftHeight,rightHeight)+1;
    }
}
