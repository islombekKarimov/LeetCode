package com.leetCode;

public class CountNumberConsistentStrings {

  public static void main(String[] args) {
    System.out.println(
        countConsistentStrings("ab", new String[] {"ad", "bd", "aaab", "baa", "badab"}));
  }

  public static int countConsistentStrings(String allowed, String[] words) {
    int count = 0;
    boolean check = false;
    for (int i = 0; i < words.length; i++) {
      char[] arr = words[i].toCharArray();
      for (int j = 0; j < arr.length; j++) {
        if (allowed.contains(arr[j] + "")) {
          check = true;
        } else {
          check = false;
            break;
        }
      }
      if (check == true) {
          count++;
      }
    }

    return count;
  }
}
