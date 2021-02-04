package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
  public static void main(String[] args) {
    System.out.println(noLong(Arrays.asList("this", "not", "too", "long")));
  }

  public static List<String> noLong(List<String> strings) {
    return strings.stream().filter(str -> str.length() < 4).collect(Collectors.toList());
  }
}
