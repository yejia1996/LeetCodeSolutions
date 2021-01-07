package LeetCode;

public class PathSum3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 以root为根的树中，和为目标值的路径总数
    public int pathSum(TreeNode root, int sum) {
        if (root == null) { return 0; }
        // 以root为根，即以root为开头，路径数
        int pathRoot = count(root, sum);
        // 以root.left为根，路径数
        int pathLeft = pathSum(root.left, sum);
        // 以root.right为根，路径数
        int pathRight = pathSum(root.right, sum);
        return pathRoot+pathLeft+pathRight;
    }

    // 以node节点开头，和为目标值的路径总数
    public int count(TreeNode node, int sum) {
        if (node == null) { return 0; }
        // node为单独路径
        int isRoot = node.val==sum ? 1 : 0;
        // node.left
        int isLeft = count(node.left,sum-node.val);
        int isRight = count(node.right,sum-node.val);
        return isRoot+isLeft+isRight;
    }
}
