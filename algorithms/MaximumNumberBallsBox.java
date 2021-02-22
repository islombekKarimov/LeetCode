package com.leetCode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberBallsBox {
  public static void main(String[] args) {
    System.out.println(countBalls(1, 10));
  }

  public static int countBalls(int lowLimit, int highLimit) {
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = lowLimit; i <= highLimit; i++) {
      int temp = digitSum(i);
      map.put(temp, map.getOrDefault(temp, 0) + 1);
      sum = Math.max(sum, map.get(temp));
    }

    return sum;
  }

  private static int digitSum(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
