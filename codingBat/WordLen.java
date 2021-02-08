package com.codingBad.map;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
  public static void main(String[] args) {
    wordLen(new String[]{"this", "and", "that", "and"});
  }

  public static Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> wordLength = new HashMap<>();
      for (String string : strings) {
          wordLength.put(string, string.length());
      }
    return wordLength;
  }
}
