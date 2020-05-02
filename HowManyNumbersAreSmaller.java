package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 02.05.2020.
 */
public class HowManyNumbersAreSmaller {

    public static void main(String[] args) {

        int[] arr = smallerNumbersThanCurrent(new int[]{6,6,6,6});
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] mas = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
                mas[i] = count;
            }
        }

        return mas;
    }
}
