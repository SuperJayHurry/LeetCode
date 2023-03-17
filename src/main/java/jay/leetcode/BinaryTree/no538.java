package jay.leetcode.BinaryTree;

public class no538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return null;
        convert(root);
        return root;
    }

    public void convert(TreeNode root){
        if(root==null)
            return ;
        convert(root.right);
        int temp = root.val;
        root.val += sum;
        sum += temp;
        convert(root.left);
    }
}
