package com.leetCode.task;

public class MoveZeroes {
  public static void main(String[] args) {
    moveZeroes(new int[] {0, 1, 0, 3, 12});
  }

  public static void moveZeroes(int[] nums) {
    int position = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[position++] = nums[i];
      }
    }
    for (int i = position; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
