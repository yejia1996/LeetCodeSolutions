package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex+1);
        // case 0 first row
        if (rowIndex==0) {
            row.add(1);
            return row;
        }
        // case 1 second row
        if (rowIndex==1) {
            row.add(1);
            row.add(1);
            return row;
        }
        // case 2-inf
        List<Integer> prevRow = getRow(rowIndex-1);
        for (int i = 0; i <= rowIndex; i++) {
            if (i==0 || i==rowIndex) {
                row.add(1);
            } else {
                row.add(prevRow.get(i-1)+prevRow.get(i));
            }
        }
        return row;
    }
}
