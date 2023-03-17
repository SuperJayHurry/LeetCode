package jay.leetcode.BinaryTree;

public class no101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if (left == null && right != null) return false;
        else if (left != null && right == null) return false;
        if(left==null && right == null)
            return true;
        if(right.val!=left.val)
            return false;
        boolean cmp1 = compare(left.left,right.right);
        boolean cmp2 = compare(left.right,right.left);
        boolean target = cmp1 && cmp2;
        return target;
    }
}
