package jay.leetcode.BinaryTree;

public class no404 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        int leftValue,rightValue;
        leftValue = rightValue = 0;
        int value = 0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 0;
        leftValue = sumOfLeftLeaves(root.left);
        rightValue = sumOfLeftLeaves(root.right);
        if(root.left!=null &&root.left.left==null && root.left.right==null) {
            value = root.left.val;
        }
        return leftValue+rightValue+value;
    }
}
