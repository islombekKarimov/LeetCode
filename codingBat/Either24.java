package com.codingBad.array;

public class Either24 {
  public static void main(String[] args) {
    System.out.println(either24(new int[]{1, 2, 3, 4}));
  }

  public static boolean either24(int[] nums) {
    boolean find2 = false;
    boolean find4 = false;
    for (int i=0; i<nums.length; i++){
        if(i + 1 != nums.length && nums[i]==2 && nums[i+1] == 2){
            find2 = true;
        }
        else if(i + 1 != nums.length && nums[i]==4 && nums[i+1]==4){
            find4 = true;
        }
    }
    if(find2 && find4){
    return false;
    }
    else if(find2 || find4){
        return true;
    }
    else {
        return false;
    }
  }
}
