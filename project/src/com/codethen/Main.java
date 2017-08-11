package com.codethen;

/** String util functions */
class Main {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.err.println("Use arguments: TEXT NUMBER");
      System.err.println("The program will show the TEXT repeated NUMBER times.");
      return;
    }

    String text = args[0];
    int n = Integer.parseInt(args[1]);

    String result = com.codethen.util.StringUtil.repeat(text, n);

    System.out.println("Result: " + result);
  }
}
