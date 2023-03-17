package jay.leetcode.BinaryTree;

public class no450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
        if(root.val==key){
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(root.left==null && root.right==null)
                return null;
            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            if(left.right==null){
                left.right = right;
                return left;
            }else if(right.left==null){
                right.left = left;
                return right;
            }
            TreeNode temp = right;
            while(temp.left!=null)
                temp = temp.left;
            temp.left = left.right;
            left.right = right;
            return left;
        }
        TreeNode leftReturn = deleteNode(root.left, key);
        if(leftReturn!=root.left){
            root.left = leftReturn;
        }
        TreeNode rightReturn = deleteNode(root.right,key);
        if(rightReturn!=root.right){
            root.right= rightReturn;
        }
        return root;
    }
}
