package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 06.07.2020.
 */
public class RunningSumOfArray {

    public static void main(String[] args) {
        runningSum(new int[]{1, 2, 3, 4});
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i-1];
            }

        return nums;
    }

}
