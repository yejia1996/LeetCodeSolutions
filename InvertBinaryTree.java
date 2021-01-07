package LeetCode;

public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        // 1. 找出终止条件
        // 3. 明确这一步递归干了什么
        if (root==null) { return null; }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        // 2. 找出返回值
        return root;
    }
}
