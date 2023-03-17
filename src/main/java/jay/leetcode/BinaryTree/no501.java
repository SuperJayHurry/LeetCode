package jay.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class no501 {
    TreeNode pre = null;
    int maxCount = 0;
    int Count = 0;
    List<Integer> target = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] arr = new int[target.size()];
        for(int i=0;i< target.size();++i){
            arr[i] = target.get(i);
        }
        return arr;

    }

    public void traversal(TreeNode root){
        if(root==null)
            return;
        traversal(root.left);

        if(pre==null)
            Count=1;
        else if(pre.val==root.val)
            Count++;
        else
            Count=1;
        if(Count>maxCount){
            maxCount = Count;
            target.clear();
            target.add(root.val);
        }
        if(Count==maxCount){
            target.add(root.val);
        }

        pre = root;

        traversal(root.right);
        return;

    }
}
