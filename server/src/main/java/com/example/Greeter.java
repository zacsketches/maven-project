package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *@param someone is the person to greet
  *@return a sring greeting.
  */
  public final String greet(final String someone) {
    return String.format("It is a pleasure to meet you, %s!", someone);
  }
}
