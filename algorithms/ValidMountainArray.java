package com.leetCode.task;

public class ValidMountainArray {
  public static void main(String[] args) {
    System.out.println(validMountainArray(new int[] {0, 3, 2, 1}));
  }

  public static boolean validMountainArray(int[] arr) {
    boolean increasing = false;
    boolean decreasing = false;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1] && !decreasing) {
        increasing = true;
      } else if (arr[i] < arr[i - 1] && increasing) {
        decreasing = true;
      } else {
        increasing = false;
        break;
      }
    }
    return increasing && decreasing;
  }
}
