package com.codingBad.array;

public class No14 {

  public static void main(String[] args) {
    System.out.println(no14(new int[]{1, 2, 3}));
  }

  public static boolean no14(int[] nums) {
    boolean one = false, four = false;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i] ==1){
            one = true;
        }
        else if(nums[i] == 4){
            four = true;
        }
    }
    return (!one) || (!four);
  }
}
