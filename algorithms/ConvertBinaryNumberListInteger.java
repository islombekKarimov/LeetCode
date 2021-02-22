package com.leetCode;

public class ConvertBinaryNumberListInteger {
  public static void main(String[] args) {
  }

  public static int getDecimalValue(ListNode head) {
    int sum = 0;
    while (head != null) {
      sum *= 2;
      sum += head.val;
      head = head.next;
    }
    return sum;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
