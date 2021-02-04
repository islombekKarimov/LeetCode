package com.codingBad.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
  public static void main(String[] args) {
    System.out.println(noZ(Arrays.asList("aaa", "bbb", "aza")));
  }
    public static List<String> noZ(List<String> strings) {
    return strings.stream().filter(str -> !str.contains("z")).collect(Collectors.toList());
    }

}
