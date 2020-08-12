package LeetCode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Islombek Karimov on 05.05.2020.
 */
public class CreateTargetArray {

    public static void main(String[] args) {
        int[] mas = createTargetArray(new int[]{1, 2, 3, 4, 0}, new int[]{0, 1, 2, 3, 0});
        Arrays.stream(mas).forEach(System.out::println);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> integerList = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integerList.add(index[i], nums[i]);
        }
        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i).intValue();
        }
        return result;
    }


}
