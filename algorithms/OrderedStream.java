package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
  String[] list;
  int count = 0;

  public OrderedStream(int n) {
    list = new String[n];
  }

  public List<String> insert(int id, String value) {
    list[--id] = value;
    List<String> stringList = new ArrayList<>();
    while (count < list.length && list[count] != null) {
      stringList.add(list[count++]);
    }
    return stringList;
  }
}
