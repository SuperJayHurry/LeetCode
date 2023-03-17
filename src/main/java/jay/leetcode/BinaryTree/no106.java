package jay.leetcode.BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class no106 {
    Map<Integer, Integer> map;  // 方便根据数值查找位置
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) { // 用map保存中序序列的数值对应位置
            map.put(inorder[i], i);
        }
        return findNode(inorder,  0, inorder.length-1, postorder,0, postorder.length-1);  // 前闭后闭
    }

    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        if(inBegin>inEnd || postBegin>postEnd){
            return null;
        }
        int rootIndex = map.get(postorder[postEnd]);
        TreeNode treeNode = new TreeNode(postorder[postEnd]);
        int leftNode = rootIndex - inBegin;
        treeNode.left = findNode(inorder,inBegin,rootIndex-1,
                postorder,postBegin,postBegin+leftNode-1);
        treeNode.right = findNode(inorder,rootIndex+1,inEnd,
                postorder,postBegin+leftNode,postEnd-1);
        return treeNode;
    }
}
