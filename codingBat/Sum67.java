package LeetCode.codingBat;

/**
 * Sum67.
 *
 * @author Islombek Karimov
 * @since 12.08.2020
 */
public class Sum67 {
    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean six = false;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                six = true;
            }
            if (six == false) {
                sum += nums[i];
            }
            if (nums[i] == 7 && six == true) {
                six = false;
            }
        }
        return sum;
    }

}