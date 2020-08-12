package LeetCode.algorithms;

import codingBat.array.Array;

import java.util.Arrays;

/**
 * Created by Islombek Karimov on 13.06.2020.
 */
public class ArrayPartition {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1, 4, 3, 2}));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}
