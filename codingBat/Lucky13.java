package LeetCode.codingBat;

/**
 * Lucky13.
 *
 * @author Islombek Karimov
 * @since 27.08.2020
 */
public class Lucky13 {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 || nums[i] == 3){
                return false;
            }
        }
        return true;
    }

}