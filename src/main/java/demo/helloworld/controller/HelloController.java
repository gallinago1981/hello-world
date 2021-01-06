package demo.helloworld.controller;

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

}
