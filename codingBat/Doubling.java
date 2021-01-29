package com.codingBad.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

  public static void main(String[] args) {
    doubling(Arrays.asList(1, 2, 3));
  }


  public static List<Integer> doubling(List<Integer> nums) {
    List<Integer> doubleInt = nums.stream().map(i -> i * 2).collect(Collectors.toList());
    return doubleInt;
  }
}
