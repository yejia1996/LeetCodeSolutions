package LeetCode;

public class LowestCommonAncestorOfBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int rootValue = root.val, pValue = p.val, qValue = q.val;
        if (pValue < rootValue && qValue < rootValue) {
            return lowestCommonAncestor(root.left,p,q);
        }
        else if (pValue > rootValue && qValue > rootValue) {
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
