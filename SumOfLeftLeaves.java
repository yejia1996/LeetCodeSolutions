package LeetCode;

public class SumOfLeftLeaves {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 在递归外部初始化 ans=0
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) { return 0; }
        if (root.left!=null && root.left.left==null && root.left.right==null) {
            ans += root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return ans;
    }
}
