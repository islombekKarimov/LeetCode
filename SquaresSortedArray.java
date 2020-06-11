package leetCode.algorithms;

import codingBat.array.Array;

import java.util.Arrays;

/**
 * Created by Islombek Karimov on 11.06.2020.
 */
public class SquaresSortedArray {
    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-1,0,3,10});
    }

    public static int[] sortedSquares(int[] A) {
        int[] mass = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            mass[i] = Math.abs(A[i]*A[i]);
        }
        Arrays.sort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        return mass;
    }

}
