package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePathsIteration {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        if (root==null) { return paths; }

        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        LinkedList<String> pathStack = new LinkedList();
        nodeStack.add(root);
        pathStack.add(Integer.toString(root.val));
        TreeNode node;
        String path;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pollLast();
            path = pathStack.pollLast();
            if ((node.left == null) && (node.right == null)) {
                paths.add(path);
            }
            if (node.left != null) {
                nodeStack.add(node.left);
                pathStack.add(path + "->" + Integer.toString(node.left.val));
            }
            if (node.right != null) {
                nodeStack.add(node.right);
                pathStack.add(path + "->" + Integer.toString(node.right.val));
            }
        }
        return paths;
    }
}
