package com.leetCode;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
  public static void main(String[] args) {
    System.out.println(canMakeArithmeticProgression(new int[] {3, 5, 1}));
  }

  public static boolean canMakeArithmeticProgression(int[] arr) {
    boolean check = true;
    Arrays.sort(arr);
    int deference = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
        if(arr[i]-arr[i-1]!=deference) {
        check = false;
      }
    }
    return check;
  }
}
