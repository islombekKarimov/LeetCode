package com.leetCode.task;

import java.util.stream.IntStream;

public class ThirdMaximumNumber {
  public static void main(String[] args) {
    System.out.println(thirdMax(new int[] {2, 1, 1}));
  }

  public static int thirdMax(int[] nums) {
    if (nums.length < 3) {
      return IntStream.of(nums).reduce(0, Integer::max);
    }
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    int step = 0;
    for (int value : nums) {

      if (value == Integer.MIN_VALUE) {
        step = 1;
      }
      if (first == Integer.MIN_VALUE) {
        first = value;
      } else if (value > first) {
        third = second;
        second = first;
        first = value;
      } else if (value < first && value > second) {
        third = second;
        second = value;
      } else if (value < second && value > third) {
        third = value;
      }
    }
    if (second == Integer.MIN_VALUE) return first;
    if (third == Integer.MIN_VALUE && step == 0) return first;
    return third;
  }
}
