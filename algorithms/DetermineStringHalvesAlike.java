package com.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineStringHalvesAlike {
  public static void main(String[] args) {
    System.out.println(halvesAreAlike("textbook"));
  }

  public static boolean halvesAreAlike(String s) {
    int aCount =0;
    int bCount =0;
    Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    String a = s.substring(0, s.length()/2);
    String b = s.substring(s.length()/2);
    for (char ch : a.toCharArray()){
        if(vowels.contains(ch))
            aCount++;
    }
    for (char ch : b.toCharArray()){
        if(vowels.contains(ch)){
            bCount++;
        }
    }
      return aCount==bCount ? true : false;
  }
}
