package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 10.06.2020.
 */
public class ShuffleTheArray {
    public static void main(String[] args) {

        shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            result[count++] = nums[i];
            result[count++] = nums[i + n];
        }

        return result;
    }

}
