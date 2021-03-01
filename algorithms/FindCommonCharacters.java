package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
  public static void main(String[] args) {
    String[] a = new String[] {"bella", "label", "roller"};
    System.out.println(commonChars(a));
  }

  public static List<String> commonChars(String[] A) {
    List<String> strings = new ArrayList<>();
    for (char i = 'a'; i <= 'z'; i++) {
      int minWorld = Integer.MAX_VALUE;
      for (String s : A) {
        int worldCount = 0;
        for (char c : s.toCharArray())
          if (i == c) {
            worldCount++;
          }
        minWorld = Math.min(minWorld, worldCount);
      }
      for (int j = 0; j < minWorld; j++) {
        strings.add(i + "");
      }
    }
    return strings;
  }
}
