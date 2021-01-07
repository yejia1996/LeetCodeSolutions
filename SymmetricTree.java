package LeetCode;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p==null && q==null) {return true;}
        else if (p==null || q==null) {return false;}
        else if (p.val != q.val) {return false;}
        else { return check(p.left,q.right) && check(p.right,q.left); }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null) {return true;}
        return check(root.left,root.right);
    }
}
