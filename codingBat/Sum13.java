package com.codingBad.array;

public class Sum13 {
  public static void main(String[] args) {
    System.out.println(sum13(new int[] {1, 2, 13, 2, 1, 13}));
  }

  public static int sum13(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 13) {
        sum += nums[i];
        if (i > 0 && nums[i - 1] == 13) {
          sum -= nums[i];
        }
      }
    }
    return sum;
  }
}
