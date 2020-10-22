package demo.helloworld.controller;

import static demo.helloworld.type.TimeZoneType.getCurrentTimeZone;

import demo.helloworld.type.MessageType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello World";
  }

  @GetMapping(path = "/hello2")
  public String hello2() {
    return "Hello 2nd";
  }

  @GetMapping(path = "/hello3")
  public String hello3() {
    return MessageType.get().getMessage();
  }

  @GetMapping(path = "/hello4")
  public String hello4() {
    return "Hello 4th";
  }

  @GetMapping(path = "/greeting")
  public String greeting() {
    switch (getCurrentTimeZone()) {
      case MORNING: return "Morning";
      case NOON: return "Hello";
      case EVENING: return "Good Bye.";
      case NIGHT: return "Good Night";
      case MIDNIGHT: return "Sleep soon";
      default:
        throw new IllegalStateException("Unexpected value: " + getCurrentTimeZone());
    }
  }

}
