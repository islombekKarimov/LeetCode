package com.leetCode;

public class CountMatchesTournament {
  public static void main(String[] args) {

    System.out.println(numberOfMatches(14));
  }

  public static int numberOfMatches(int n) {
    int sum = 0;
    while (n>1) {
      sum += n/2;
      n = (n + 1) / 2;
    }

    return sum;
  }
}
