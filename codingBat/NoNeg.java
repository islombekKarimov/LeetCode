package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
  public static void main(String[] args) {
    List<Integer> integerList = noNeg(Arrays.asList(-3, -3, 3, 3));
    integerList.forEach(System.out::println);
  }

  public static List<Integer> noNeg(List<Integer> nums) {
    return nums.stream().filter(i -> i >= 0).collect(Collectors.toList());
  }
}
