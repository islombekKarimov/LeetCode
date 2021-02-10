package com.leetCode;

public class GoalParserInterpretation {
  public static void main(String[] args) {
    System.out.println(interpret("G()()()()(al)"));
  }

  public static String interpret(String command) {
    StringBuilder builder = new StringBuilder();
    String[] arr = command.split("");
    for (int i = 0; i < command.length(); i++) {
      if (arr[i].equals("(") && arr[i + 1].equals(")")) {
        builder.append("o");
      } else if (arr[i].equals("(") || arr[i].equals(")")) {
        builder.append("");
      } else {
        builder.append(arr[i]);
      }
    }
    return builder.toString();
  }
}
