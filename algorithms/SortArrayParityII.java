package com.leetCode;

import java.util.stream.IntStream;

public class SortArrayParityII {
  public static void main(String[] args) {
    int[] mass = sortArrayByParityII(new int[] {4, 2, 5, 7});
    IntStream.of(mass).forEach(System.out::println);
  }

  public static int[] sortArrayByParityII(int[] nums) {
    int[] arr = new int[nums.length];
    int pos = 0;
    for (Integer n : nums) {
      if (n % 2 == 0) {
        arr[pos] = n;
        pos += 2;
      }
    }
    pos = 1;
    for (Integer n : nums) {
      if (n % 2 == 1) {
        arr[pos] = n;
        pos += 2;
      }
    }

    return arr;
  }
}
