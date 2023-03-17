package jay.leetcode.BinaryTree;

public class no222 {
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

    public int countNodes(TreeNode root) {
        int leftDepth,rightDepth;
        leftDepth=rightDepth=0;
        TreeNode left = root;
        TreeNode right = root;
        while(left!=null){
            leftDepth++;
            left = left.left;
        }
        while(right!=null){
            rightDepth++;
            right = right.right;
        }

        if(rightDepth==leftDepth){
            return (int)Math.pow(2,leftDepth) - 1;
        }

        return countNodes(root.left)+countNodes(root.right) +1;
    }
}
