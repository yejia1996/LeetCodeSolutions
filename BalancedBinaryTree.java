package LeetCode;

public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root){
        if (root==null) {return 0;}
        int heightLeft = height(root.left);
        int heightRight = height(root.right);
        if (heightLeft==-1 || heightRight==-1 || Math.abs(heightRight-heightLeft)>1) {
            return -1;
        } else {
            return Math.max(heightRight,heightLeft)+1;
        }
    }
}
