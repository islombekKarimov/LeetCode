package LeetCode.codingBat;

/**
 * Has22.
 *
 * @author Islombek Karimov
 * @since 27.08.2020
 */
public class Has22 {
    public static void main(String[] args) {
        System.out.println(has22(new int[]{1, 2,  2}));
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2) {
                i++;
                if (nums[i] == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}