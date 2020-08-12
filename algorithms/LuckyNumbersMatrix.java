package LeetCode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Islombek Karimov on 12.06.2020.
 */
public class LuckyNumbersMatrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            integerSet.add(min);
            min = Integer.MAX_VALUE;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            if (integerSet.contains(max)) {
                integerList.add(max);
            }
            max = Integer.MIN_VALUE;
        }
        return integerList;
    }
}

