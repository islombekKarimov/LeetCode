package leetCode.algorithms;


/**
 * Created by Islombek Karimov on 16.10.2018.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] b = {2, 7, 11, 15};
        int t = 9;
        System.out.println("=== " +  twoSum(b, t));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result = new int []{i,j};
                }
            }
        }
        return result;

    }
}
