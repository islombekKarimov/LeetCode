package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
  public static void main(String[] args) {
    lower(Arrays.asList("Hello", "Hi")).forEach(System.out::println);
  }
    public static List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}
