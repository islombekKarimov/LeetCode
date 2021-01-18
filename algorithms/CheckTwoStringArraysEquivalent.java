package com.leetCode;

public class CheckTwoStringArraysEquivalent {

  public static void main(String[] args) {
    System.out.println(arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a", "bc"}));
  }

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    boolean check = false;
    StringBuilder builder = new StringBuilder();
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < word1.length; i++) {
      builder.append(word1[i]);
    }

    for (int j = 0; j < word2.length; j++) {
      stringBuilder.append(word2[j]);
    }

    if (builder.toString().equals(stringBuilder.toString())) {
      check = true;
    }

    return check;
  }
}
