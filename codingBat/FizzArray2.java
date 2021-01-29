package com.codingBad.array;

public class FizzArray2 {
  public static void main(String[] args) {
      fizzArray2(4);
  }

  public static String[] fizzArray2(int n) {
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
       arr[i] = "" + i;
    }
    return arr;
  }
}
