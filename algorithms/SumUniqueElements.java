package com.leetCode;

import java.util.HashMap;

public class SumUniqueElements {
  public static void main(String[] args) {
    System.out.println(sumOfUnique(new int[] {10,6,9,6,9,6,8,7}));
  }

  public static int sumOfUnique(int[] nums) {
    HashMap<Integer, Boolean> integers = new HashMap<>();
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (!integers.containsKey(nums[i])) {
        integers.put(nums[i], true);
        sum = sum + nums[i];
      } else {
        if (integers.get(nums[i])) {
          sum = sum - nums[i];
          integers.put(nums[i], false);
        }
      }
    }
    return sum;
  }


}
