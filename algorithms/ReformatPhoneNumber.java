package com.leetCode;

public class ReformatPhoneNumber {

  public static void main(String[] args) {
//    System.out.println(reformatNumber("123 4-5678"));
    System.out.println(text("123 4-5678"));
  }


  //faster than 45.5 %
  public static String reformatNumber(String number) {
    StringBuilder builder = new StringBuilder();
    number = number.replaceAll("\\s|-", "");
    int i = 0;
    while (i < number.length() - 4) {
      builder.append(number, i, i + 3).append("-");
      i += 3;
    }
    if (number.length() - i == 4) {
      builder.append(number, i, i + 2).append("-");
      i += 2;
    }
    builder.append(number.substring(i));
    return builder.toString();
  }

//  faster than 30%
  public static String text(String number){
      return number.replaceAll("\\D", "").replaceAll("...?(?=..)", "$0-");
  }

}
