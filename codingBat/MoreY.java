package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

  public static void main(String[] args) {
    moreY(Arrays.asList("a", "b", "c")).forEach(System.out::println);
  }

  public static List<String> moreY(List<String> strings) {
    return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
  }
}
