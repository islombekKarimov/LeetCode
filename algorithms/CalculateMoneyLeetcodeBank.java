package com.leetCode;

public class CalculateMoneyLeetcodeBank {
  public static void main(String[] args) {
    System.out.println(totalMoney(4));
  }

  public static int totalMoney(int n) {
    int sum = 0;
    int prev=0;
    int count=0;
    for (int i=0; i<n;i++){
        if(i%7==0){
            prev++;
            count = prev;
        }
        else {
            count++;
        }
        sum +=count;
    }
    return sum;
  }
}
