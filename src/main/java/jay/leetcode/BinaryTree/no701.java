package jay.leetcode.BinaryTree;

public class no701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode treeNode = new TreeNode(val);
            return treeNode;
        }
        return insertIntoBST2(root,val);
    }

    public TreeNode insertIntoBST2(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.left==null && root.val > val){
            TreeNode treeNode = new TreeNode(val);
            root.left = treeNode;
            return root;
        }
        else if(root.right==null && root.val < val){
            TreeNode treeNode = new TreeNode(val);
            root.right = treeNode;
            return root;
        }
        if(root.val > val)
            insertIntoBST2(root.left,val);
        else
            insertIntoBST2(root.right,val);
        return root;
    }
}
