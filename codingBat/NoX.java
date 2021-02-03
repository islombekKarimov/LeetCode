package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {
  public static void main(String[] args) {
    noX(Arrays.asList("ax", "bb", "cx")).forEach(System.out::println);
  }

    public static List<String> noX(List<String> strings) {
       return strings.stream().map(s-> s.replaceAll("x", "")).collect(Collectors.toList());
    }

}
