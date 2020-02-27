package demo.helloworld.type;

import java.util.Random;

public enum MessageType {
  TYPE1("Good Morning"),
  TYPE2("Hello"),
  TYPE3("Good Evening");

  String message;

  MessageType(String message) {
    this.message = message;
  }
  public String getMessage() {
    return message;
  }
  public static MessageType get() {
    Random r = new Random(10);
    return values()[r.nextInt()%3];
  }
}
