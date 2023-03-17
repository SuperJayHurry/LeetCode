package jay.leetcode.BinaryTree;

import java.util.LinkedList;

public class no112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        targetSum = targetSum - root.val;
        return traversal(root,targetSum);
    }

    public boolean traversal(TreeNode root,int targetSum){
        boolean flag = false;
        int num = 0;
        if(root.left==null && root.right==null){
            if(num==targetSum){
                return true;
            }
        }
        if(root.left!=null){
            targetSum -= root.left.val;
            flag = flag||traversal(root.left,targetSum);
            targetSum +=root.left.val;
        }
        if(root.right!=null){
            targetSum -= root.right.val;
            flag = flag||traversal(root.right,targetSum);
            targetSum +=root.right.val;
        }
        return flag;
    }
}
