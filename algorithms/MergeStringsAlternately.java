package com.leetCode;

public class MergeStringsAlternately {
  public static void main(String[] args) {
    System.out.println(mergeAlternately("ab", "pqrs"));
  }

  public static String mergeAlternately(String word1, String word2) {
    StringBuilder builder = new StringBuilder();
    int maxLen = Math.max(word1.length(), word2.length());
    for (int i = 0; i < maxLen; i++) {
      if (i < word1.length()) {
        builder.append(word1.charAt(i));
      }
      if (i < word2.length()) {
        builder.append(word2.charAt(i));
      }
    }
    return builder.toString();
  }
}
