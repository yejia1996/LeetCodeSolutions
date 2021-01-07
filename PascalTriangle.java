package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // case 1
        if (numRows == 0) {
            return triangle;
        }
        // case 2 第一层初始化为[1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i-1);

            // 任意行的左侧第一个永远为1
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            // 任意行的右侧最后一个永远为1
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}
