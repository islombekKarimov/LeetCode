package com.leetCode;

public class ReverseWordsString {
  public static void main(String[] args) { //
    System.out.println(reverseWords("Let's take LeetCode contest"));
  }

  public static String reverseWords(String s) {
    StringBuilder text = new StringBuilder();
    String[] arr = s.split(" ");
    for (int i = 0; i < arr.length; i++) {
        for (int j = arr[i].length() - 1; j >= 0; j--) {
        char c = arr[i].charAt(j);
        if (i == arr.length - 1 && j == 0) {
          text.append(c);
        }
        else if(j==0){
            text.append(c + " ");
        }
        else {
            text.append(c);
        }
      }
    }

    return text.toString();
  }
}
