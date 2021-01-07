package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // 前序遍历第一位为根，根在中序遍历中的位置为index
    // 中序遍历[0,index-1]为左子树，[index+1,inorder.length]为右子树
    Map<Integer, Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 构造哈希映射，快速定位根节点
        for (int i = 0; i < preorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder,
                0, preorder.length - 1,
                0, inorder.length - 1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int preorderLeftEdge,
                                              int preorderRightEdge, int inorderLeftEdge, int inorderRightEdge) {
        if (preorderLeftEdge > preorderRightEdge) {
            return null;
        }
        int inorderRootIndex = indexMap.get(preorder[preorderLeftEdge]);
        TreeNode root = new TreeNode(preorder[preorderLeftEdge]);
        int sizeOfLeftSubtree = inorderRootIndex-inorderLeftEdge;
        // 递归构造左子树，连接到根节点
        // 前序遍历中「从 左边界+1 开始的 sizeOfLeftSubtree」个元素 对应
        // 中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preorder, inorder,
                preorderLeftEdge+1, preorderLeftEdge+sizeOfLeftSubtree,
                inorderLeftEdge, inorderRootIndex-1);
        // 递归构造右子树，连接到根节点
        // 前序遍历中「从 左边界+1+sizeOfLeftSubtree 开始到 右边界」个元素 对应
        // 中序遍历中「从 根节点定位+1 开始到 右边界」的元素
        root.right = myBuildTree(preorder, inorder,
                preorderLeftEdge+sizeOfLeftSubtree+1, preorderRightEdge,
                inorderRootIndex+1, inorderRightEdge);
        return root;
    }
}
