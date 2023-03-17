package jay.leetcode.BinaryTree;

public class no235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        if((root.val>=p.val && root.val<=q.val) || (root.val>=q.val && root.val<=p.val))
            return root;
        if(lowestCommonAncestor(root.left,p,q)!=null)
            return lowestCommonAncestor(root.left,p,q);
        if(lowestCommonAncestor(root.right,p,q)!=null)
            return lowestCommonAncestor(root.right,p,q);
        return null;
    }
}
