package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;

public class NoTeen {
  public static void main(String[] args) {
    System.out.println(noTeen(Arrays.asList(12, 13, 19, 20)));
  }

  public static List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(i -> i > 12 & i < 20);
    return nums;
  }
}
