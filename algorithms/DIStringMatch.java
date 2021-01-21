package com.leetCode;

public class DIStringMatch {
  public static void main(String[] args) {
    int[] mass = diStringMatch("IDID");
    for (int i = 0; i < mass.length; i++) {
      System.out.println(mass[i]);
    }
  }

  public static int[] diStringMatch(String S) {
    int[] arr = new int[S.length() + 1];
    int I = 0, D = S.length();
    for (int i = 0; i < S.length(); ++i) {
      if (S.charAt(i) == 'I') {
        arr[i] = I++;
      } else {
        arr[i] = D--;
      }
    }
      arr[S.length()] = I;
    return arr;
  }
}
