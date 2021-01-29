package com.codingBad.array;

public class Only14 {
  public static void main(String[] args) {
    System.out.println(only14(new int[] {1, 4, 2, 4}));
  }

    public static boolean only14(int[] nums) {
        boolean  check = false;
        if(nums.length==0) return true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                check = true;
            } else {
                return false;
            }
        }
        return check;

    }
}
