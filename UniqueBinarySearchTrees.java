package LeetCode;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        // 假设n个节点存在二叉排序树的总个数为G(n)
        // 以i为根的二叉排序树的个数为F(i)
        // G(n)=F(1)+F(2)+F(3)+F(4)+...+F(n)
        // i为根节点时，左子树为[1,2,3,...,i-1]，右子树为[i+1,i+2,...n]
        // 左子树存在二叉排序树的总个数为G(i-1)
        // 右子树存在二叉排序树的总个数为G(n-i)
        // F(i)=G(i-1)*G(n-i)
        // G(n)=F(1)+...+F(n)
        // G(n)=G(0)*G(n-1)+G(1)*G(n-2)+...+G(n-1)*G(0)
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        // G(2)=G(0)*G(1)+G(1)*G(0)
        // G(3)=G(0)*G(2)+G(1)*G(1)+G(2)*G(0)
        // G(4)=G(0)*G(3)+G(1)*G(2)+G(2)*G(1)+G(3)*G(0)
        for (int target = 2; target <= n; target++) {
            // 接下来目标是一步步求出G[target]，与n无关
            for (int temp = 0; temp < target; temp++) {
                G[target] += G[temp] * G[target-temp-1];
            }
        }
        return G[n];
    }
}