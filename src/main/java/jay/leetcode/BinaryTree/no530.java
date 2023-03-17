package jay.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class no530 {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversal(list,root);
        int minNum = 9999;
        for(int i=1;i<list.size();++i){
            if(minNum > (list.get(i)-list.get(i-1)))
                minNum = list.get(i)-list.get(i-1);
        }
        return minNum;
    }

    public void traversal(List<Integer> list,TreeNode root){
        if(root==null)
            return;
        traversal(list,root.left);
        list.add(root.val);
        traversal(list,root.right);
    }
}
