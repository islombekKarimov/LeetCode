package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
  public static void main(String[] args) {
      math1(Arrays.asList(1, 2, 3)).forEach(System.out::println);
  }

  public static List<Integer> math1(List<Integer> nums) {
      return nums.stream().map(i -> ((i+1)*10)).collect(Collectors.toList());
  }
}
