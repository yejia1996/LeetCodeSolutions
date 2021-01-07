package LeetCode;

public class MinimumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if (root==null) {return 0;}
        // 1.左孩子和右孩子都为空，说明到达叶子节点，直接返回1即可
        if (root.left==null && root.right==null) { return 1;}

        // 2.左孩子和右孩子其中一个为空，m1 m2必有一个为0，返回不为0的深度+1
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);
        if (root.left==null || root.right==null) {return m1+m2+1;}

        // 3.左右孩子都不为空，返回最小深度+1
        return Math.min(m1,m2) + 1;
    }
}
