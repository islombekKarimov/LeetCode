package com.codingBad.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {

  public static void main(String[] args) {
    System.out.println(no9(Arrays.asList(9, 19, 29, 3)));
  }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(i -> i%10 !=9).collect(Collectors.toList());
    }

}
