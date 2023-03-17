package jay.leetcode.BinaryTree;

public class no513 {
    static int result = 0;
    static int maxDepth = 1;
    static int depth = 1;

    public int findBottomLeftValue(TreeNode root) {
        leftValue(root);
        return result;
    }

    public static void leftValue(TreeNode root){
        if(root.left==null && root.right==null){
            if(depth>maxDepth){
                maxDepth = depth;
                result = root.val;
            }
        }

        if(root.left!=null){
            depth++;
            leftValue(root.left);
            depth--;
        }

        if(root.right!=null){
            depth++;
            leftValue(root.right);
            depth--;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(-1, null, null);
        TreeNode root = new TreeNode(0, null, treeNode);
        no513 a = new no513();
        System.out.println(a.findBottomLeftValue(root));
    }
}
