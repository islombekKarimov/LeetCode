package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 12.05.2020.
 */
public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{{5, 1, 0},{-5,-5,-5}}));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
