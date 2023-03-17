package jay.leetcode.greedy;

import jay.leetcode.BinaryTree.TreeNode;

public class no968 {
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

    /**
     * 2 代表覆盖 1代表摄像头 0代表无覆盖
     * @param root
     * @return
     */
    int camera = 0;

    public int traversal(TreeNode root){
        if(root==null)
            return 2;
        int left = traversal(root.left);
        int right = traversal(root.right);
        if(left==0 || right==0){
            camera++;
            return 1;
        } else if (left==2 && right==2) {
            return 0;
        }else{
            return 2;
        }
    }

    public int minCameraCover(TreeNode root) {
        int num = traversal(root);
        if(num==0)
            camera++;
        return camera;
    }
}
