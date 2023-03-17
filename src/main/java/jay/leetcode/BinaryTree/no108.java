package jay.leetcode.BinaryTree;

import java.util.Arrays;

public class no108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        int index = nums.length/2;
        TreeNode treeNode = new TreeNode(nums[index]);
        int[] left = Arrays.copyOfRange(nums,0,index);
        int[] right = Arrays.copyOfRange(nums,index+1,nums.length);
        treeNode.left = sortedArrayToBST(left);
        treeNode.right = sortedArrayToBST(right);
        return treeNode;
    }
}
