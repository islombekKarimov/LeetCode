package com.leetCode;

public class FindUniqueIntegersSumZero {
  public static void main(String[] args) {
    sumZero(5);
  }

  public static int[] sumZero(int n) {
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i * 2 - n + 1;
      System.out.println(arr[i]);
    }
    return arr;
  }


}
