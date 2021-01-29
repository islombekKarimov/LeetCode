package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
  public static void main(String[] args) {
     List<Integer> list = square(Arrays.asList(1, 2, 3));
     list.forEach(System.out::println);
  }
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream().map(i -> i*i).collect(Collectors.toList());
    }
}
