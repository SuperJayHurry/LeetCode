package jay.leetcode.BinaryTree;

public class no669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)
            return null;
        if(trimBST(root.left,low,high)!=root.left)
            root.left= trimBST(root.left,low,high);
        if(trimBST(root.right,low,high)!=root.right)
            root.right = trimBST(root.right,low,high);
        if(root.val < low || root.val >high) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (root.left == null && root.right == null)
                return null;
            if (left == null)
                return right;
            if (right == null)
                return left;
            if (left.right == null) {
                left.right = right;
                return left;
            } else if (right.left == null) {
                right.left = left;
                return right;
            }
            TreeNode temp = right;
            while (temp.left != null)
                temp = temp.left;
            temp.left = left.right;
            left.right = right;
            return left;
        }
        return root;
    }
}
