package com.leetCode;

public class SumAllOddLengthSubarrays {

  public static void main(String[] args) {
    System.out.println(sumOddLengthSubarrays(new int[] {1, 4, 2, 5, 3}));
  }

  public static int sumOddLengthSubarrays(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int total = (arr.length - i) * (i + 1);
      int odd = total / 2;
      if ((total & 1) != 0) {
        odd++;
      }
      sum += odd * arr[i];
    }
    return sum;
  }
}
