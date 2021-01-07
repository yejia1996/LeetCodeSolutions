package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        // queue 为空, 全部结束
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            List<Integer> temp = new ArrayList<>();
            // queueSize次循环取出上一层所有节点；当前层所有节点进入队列
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
