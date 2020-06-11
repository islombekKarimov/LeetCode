package leetCode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Islombek Karimov on 11.06.2020.
 */
public class RepeatedElementSize2NArray {

    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public static int repeatedNTimes(int[] A) {
        int result = 0;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(!integerSet.contains(A[i])){
                integerSet.add(A[i]);
            }
            else {
                result = A[i];
            }
        }
        return result;
    }
}
