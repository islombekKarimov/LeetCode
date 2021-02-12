package com.leetCode.task;

public class RemoveDuplicatesSortedArray {
  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[] {1, 1, 2}));
  }

  public static int removeDuplicates(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[k] != nums[i]){
            k++;
            nums[k] = nums[i];
        }
    }
    return k + 1;
  }
}
