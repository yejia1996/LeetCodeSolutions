package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[len];

        if (len == 0) {
            return ans;
        }

        depthFirstSearch(nums, used, path, ans);
        return ans;
    }

    /**
     * @param nums  给定数组
     * @param used  元素是否被选取过
     * @param path  单次路径
     * @param ans   最终答案
     */
    private void depthFirstSearch(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> ans) {
        // 递归结束条件
        if (path.size()==nums.length) {
            ans.add(new ArrayList<>(path));
            // 满足条件 结束当前path
            // return结束depthFirstSearch方法，不执行后续for代码块
            return;
        }

        // for 遍历
        // 1. 将nums[i]作为path[0]初始化path
        // 2. 递归时遍历nums[]，选取未使用的元素添加到path
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                depthFirstSearch(nums, used, path, ans);

                // 满足递归结束的if代码块，回溯
                used[i] = false;
                // 重置path状态 删除最近一次添加的元素
                path.remove(path.size()-1);
            }
        }
    }
}
