package leet_code;

import java.util.ArrayList;
import java.util.List;

/**
 * Date :- 16-Oct-2023
 * 119. Pascal's Triangle II
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 *
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * Example 2:
 *
 * Input: rowIndex = 0
 * Output: [1]
 */
public class PascalsTriangle {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> res = new ArrayList<>();
            res.add(1);
            long prev = 1;
            for (int k = 1; k <= rowIndex; k++) {
                long next_val = prev * (rowIndex - k + 1) / k;
                res.add((int) next_val);
                prev = next_val;
            }
            return res;
        }
    public static void main(String[] args) {

        System.out.println(new PascalsTriangle().getRow(3));

    }
}
