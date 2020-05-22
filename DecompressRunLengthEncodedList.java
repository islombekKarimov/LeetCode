package leetCode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Islombek Karimov on 22.05.2020.
 */
public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        decompressRLElist(new int[]{1, 2, 3, 4});
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                integerList.add(nums[i + 1]);
            }
        }
        int[] arr = new int[integerList.size()];
        for (int i=0; i < arr.length; i++){
            arr[i] = integerList.get(i);
        }
        return arr;
    }

}
