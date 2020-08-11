package LeetCode.codingBat;

/**
 * Fix23.
 *
 * @author Islombek Karimov
 * @since 11.08.2020
 */
public class Fix23 {
    public static void main(String[] args) {
            fix23(new int[]{1, 2, 3});
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

}