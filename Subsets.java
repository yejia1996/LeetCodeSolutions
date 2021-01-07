package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = ans.size();
            // ans一边更新，一边遍历，无法终止。
            // 提前定义ans的长度作为终止条件。
            for (int j = 0; j < all; j++) {
                // new ArrayList<>(ans.get(j)) 新建temp对象，复制ans.get(j)
                // 不能用temp=ans.get(j)
                // 引用传递会改变ans.get(i)位置的List<Integer>
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(nums[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
