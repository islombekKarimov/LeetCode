package com.leetCode;

public class ReverseString {
  public static void main(String[] args) {
    reverseString(new char[]{'h','e','l','l','o'});
  }

    public static void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i< s.length/2; i++){
            char c = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = c;
        }
    }
}
