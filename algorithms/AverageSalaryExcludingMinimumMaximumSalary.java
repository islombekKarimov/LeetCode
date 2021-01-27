package com.leetCode;

import java.util.Arrays;

public class AverageSalaryExcludingMinimumMaximumSalary {
  public static void main(String[] args) {

    System.out.println(average(new int[] {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000}));
  }

  public static double average(int[] salary) {
    double aver = 0.0;
    Arrays.sort(salary);
    for (int i=1; i<salary.length-1; i++){
        aver += salary[i];
    }
    return (aver/(salary.length-2));
  }
}
