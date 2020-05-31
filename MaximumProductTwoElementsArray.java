package leetCode.algorithms;

import java.util.Arrays;

/**
 * Created by Islombek Karimov on 31.05.2020.
 */
public class MaximumProductTwoElementsArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,7}));
    }

    public static int maxProduct(int[] nums) {
        int val = 0;
        Arrays.sort(nums);
        val = (nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        return val;
    }


}
