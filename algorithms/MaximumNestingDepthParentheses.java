package com.leetCode;

public class MaximumNestingDepthParentheses {
  public static void main(String[] args) {
    System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
  }

  public static int maxDepth(String s) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        max =  Math.max(max, ++count);
      } else if (s.charAt(i) == ')') {
        --count;
      }
    }
    return max;
  }
}
