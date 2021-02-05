package com.codingBad.array;

import java.util.Arrays;

public class CenteredAverage {
  public static void main(String[] args) {
    System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
  }

  public static int centeredAverage(int[] nums) {
    int sum = 0;
    Arrays.sort(nums);
    for (int i=1; i<nums.length-1; i++){
        sum +=nums[i];
    }
    return sum/(nums.length-2);
  }
}
