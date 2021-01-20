package com.leetCode;

public class MatrixDiagonalSum {

  public static void main(String[] args) {
    System.out.println(diagonalSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
  }

  public static int diagonalSum(int[][] mat) {
    int sum = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        if (i == j) {
          sum += mat[i][j];
        }
        if ((i + j) == (mat.length - 1) && i != j) {
          sum += mat[i][j];
        }
      }
    }

    return sum;
  }
}
