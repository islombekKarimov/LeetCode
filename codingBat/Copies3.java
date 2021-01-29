package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
  public static void main(String[] args) {
    List<String> stringList = copies3(Arrays.asList("a", "bb", "ccc"));
    stringList.forEach(System.out::println);
  }

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s +s ).collect(Collectors.toList());
    }
}
