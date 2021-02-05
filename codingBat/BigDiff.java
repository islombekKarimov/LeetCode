package com.codingBad.array;

import java.util.Arrays;

public class BigDiff {

  public static void main(String[] args) {
    System.out.println(bigDiff(new int[]{10, 3, 5, 6}));
  }

  public static int bigDiff(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length - 1] - nums[0];
  }
}
