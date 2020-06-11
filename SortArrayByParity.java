package leetCode.algorithms;

/**
 * Created by Islombek Karimov on 11.06.2020.
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        sortArrayByParity(new int[]{3, 1, 2, 4});
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] mass = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                mass[index++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                mass[index++] = A[i];
            }
        }
        return mass;
    }

}
