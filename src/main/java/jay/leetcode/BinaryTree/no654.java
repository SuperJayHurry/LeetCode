package jay.leetcode.BinaryTree;

import java.util.Arrays;

public class no654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int maxIndex = findMax(nums);
        TreeNode treeNode = new TreeNode(nums[maxIndex]);

        treeNode.left = constructMaximumBinaryTree(Arrays.copyOf(nums,maxIndex));
        treeNode.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,maxIndex+1,nums.length));
        return treeNode;
    }

    public int findMax(int[] nums){
        int index = 0;
        int num = 0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]>num){
                num = nums[i];
                index = i;
            }
        }
        return index;
    }
}
