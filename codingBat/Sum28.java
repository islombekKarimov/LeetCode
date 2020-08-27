package LeetCode.codingBat;

/**
 * Sum28.
 *
 * @author Islombek Karimov
 * @since 27.08.2020
 */
public class Sum28 {
    public static void main(String[] args) {
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8 ? true : false;
    }
}