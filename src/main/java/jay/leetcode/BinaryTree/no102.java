package jay.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class no102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> target = new ArrayList<>();
        if(root==null){
            return target;
        }
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        int length;
        TreeNode node;
        while(!treeNodes.isEmpty()){
            length = treeNodes.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i< length;++i){
                node = treeNodes.pop();
                temp.add(node.val);
                if(node.left!=null){
                    treeNodes.add(node.left);
                }
                if(node.right!=null){
                    treeNodes.add(node.right);
                }
            }
            target.add(temp);
        }
        return target;
    }
}
