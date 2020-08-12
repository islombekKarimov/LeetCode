package LeetCode.algorithms;

/**
 * Created by Islombek Karimov on 11.06.2020.
 */
public class ReplaceElementsGreatestElementRightSide {

    public static void main(String[] args) {
        replaceElements(new int[]{17,18,5,4,6,1});
    }

    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        int max = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            result[i] = max;
            if (max < arr[i]) {
                max=arr[i];
            }
        }
        return result;
    }

}
