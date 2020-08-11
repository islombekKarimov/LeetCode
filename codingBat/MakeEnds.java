package LeetCode.codingBat;

/**
 * MakeEnds.
 *
 * @author Islombek Karimov
 * @since 11.08.2020
 */
public class MakeEnds {
    public static void main(String[] args) {
       int[] mat = makeEnds(new int[]{1, 2, 3});
        System.out.println(mat[0]);
    }

    public static int[] makeEnds(int[] nums) {
        int[] arr = new int[2];
        arr[0] = nums[0];
        arr[1] = nums[nums.length-1];
        return arr;
    }

}