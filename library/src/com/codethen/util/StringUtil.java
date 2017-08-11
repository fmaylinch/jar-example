package com.codethen.util;

/** String util functions */
public class StringUtil {

  /** Returns the str repeated the given times */
  public static String repeat(String str, int times) {

    String result = "";

    for (int i = 1; i <= times; i++) {
      result += str;
    }

    return result;
  }
}
