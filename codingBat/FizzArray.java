package LeetCode.codingBat;

/**
 * FizzArray.
 *
 * @author Islombek Karimov
 * @since 27.08.2020
 */
public class FizzArray {
    public static void main(String[] args) {
        fizzArray(4);
    }

    public static int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}