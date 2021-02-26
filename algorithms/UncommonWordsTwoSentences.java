package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsTwoSentences {
  public static void main(String[] args) {
    String[] arr = uncommonFromSentences("this apple is sweet", "this apple is sour");
    Arrays.asList(arr).stream().forEach(System.out::println);
  }

  public static String[] uncommonFromSentences(String A, String B) {
    A = A + " " + B;
    HashMap<String, Integer> count = new HashMap<>();
    String[] mass = A.split("\\s");
    for (String str : mass) {
      count.put(str, count.getOrDefault(str, 0) + 1);
    }
    List<String> strings = new ArrayList<>();
    for (String s : count.keySet()) {
      if (count.get(s) == 1) {
        strings.add(s);
      }
    }
    return strings.toArray(new String[0]);
  }
}
