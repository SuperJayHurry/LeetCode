package jay.leetcode.BinaryTree;

import com.sun.source.tree.Tree;

public class no111 {
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

    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return minDepth2(root);
    }

    public static int minDepth2(TreeNode root){
        if(root==null)
            return 9999;
        if(root.left==null && root.right==null)
            return 1;
        return Math.min(minDepth2(root.left)+1,minDepth2(root.right)+1);
    }
}
