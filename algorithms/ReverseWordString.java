package com.leetCode;

public class ReverseWordString {
  public static void main(String[] args) {
    System.out.println(reverseWords("the sky is blue"));
    //      blue is sky the
    //      blue is sky the
  }

  public static String reverseWords(String s) {
    String[] arr = s.split(" ");
    StringBuilder builder = new StringBuilder();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i].length() == 0) continue;
      builder.append(arr[i] + " ");
    }
    return builder.toString().trim();
  }
}
