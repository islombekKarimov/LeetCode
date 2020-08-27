package LeetCode.codingBat;

/**
 * More14.
 *
 * @author Islombek Karimov
 * @since 27.08.2020
 */
public class More14 {
    public static void main(String[] args) {
        System.out.println(more14(new int[]{1, 1, 6, 4, 4, 1}));
    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 4) {
                count4++;
            }
        }
        return count1 > count4 ? true : false;
    }

}