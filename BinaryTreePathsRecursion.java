package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePathsRecursion {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void constructPaths(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                constructPaths(root.left, path, paths);
                constructPaths(root.right, path, paths);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        constructPaths(root, "", paths);
        return paths;
    }
}
