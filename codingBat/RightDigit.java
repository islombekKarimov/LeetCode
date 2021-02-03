package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
  public static void main(String[] args) {
    rightDigit(Arrays.asList(1, 22, 93)).forEach(System.out::println);
  }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(i -> i%10).collect(Collectors.toList());
    }
}
