package jay.leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class no257 {
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

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<Integer> path = new LinkedList<>();
        LinkedList<String> target = new LinkedList<>();
        path.addFirst(root.val);
        traversal(root,path,target);
        return target;
    }

    public static void traversal(TreeNode root,LinkedList<Integer>path,LinkedList<String>target){
        if(root.left==null && root.right==null){
            String s = "";
            for(int i =0;i< path.size()-1;++i){
                s += (path.get(i)+"->");
            }
            s += path.get(path.size()-1);
            target.add(s);
            return;
        }
        if(root.left!=null){
            path.addLast(root.left.val);
            traversal(root.left,path,target);
            path.removeLast();
        }
        if(root.right!=null){
            path.addLast(root.right.val);
            traversal(root.right,path,target);
            path.removeLast();
        }
    }
}
