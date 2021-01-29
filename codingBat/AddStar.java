package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

  public static void main(String[] args) {
      List<String> strings = addStar(Arrays.asList("a", "bb", "ccc"));
      strings.forEach(System.out::println);
  }

  public static List<String> addStar(List<String> strings) {
    return strings.stream().map(s -> s + "*").collect(Collectors.toList());
  }
}
