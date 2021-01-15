package com.leetCode;

import java.util.Arrays;
import java.util.Collections;

public class RichestCustomerWealth {

  public static void main(String[] args) {
    System.out.println(maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}}));
  }

  public static int maximumWealth(int[][] accounts) {
    int[] sum = new int[accounts.length];
    int max = sum[0];
    for (int i = 0; i < accounts.length; i++) {
      for (int j = 0; j < accounts[0].length; j++) {
        sum[i] = sum[i] + accounts[i][j];
        if(max < sum[i]){
            max = sum[i];
        }
      }
    }
    return max;
  }
}
