package LeetCode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Islombek Karimov on 11.06.2020.
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
                if (checkNumber(i)) {
                    integerList.add(i);
                }
        }
        integerList.stream().forEach(System.out::println);
        return integerList;
    }

    public static boolean checkNumber(int num) {
        int copy = num;
        while (copy > 0) {
            int digit = copy % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            copy /= 10;
        }
        return true;
    }


}
