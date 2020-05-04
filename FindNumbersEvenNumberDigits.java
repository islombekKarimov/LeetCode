package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 04.05.2020.
 */
public class FindNumbersEvenNumberDigits {
    public static void main(String[] args) {
        findNumbers(new int[]{12,345,2,6,7896});
    }

    public static int findNumbers(int[] nums) {
        int even = 0;
        int count;
        for (int i = 0; i < nums.length; i++) {
           count =0;
            while (nums[i] != 0) {
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
        return even;
    }
}
