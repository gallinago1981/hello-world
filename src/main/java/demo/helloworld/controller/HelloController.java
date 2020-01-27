package demo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/conflict")
  public String conflict() {
    return "Hello Conflict";
  }
  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello World - #4 issue";
  }

  @GetMapping(path = "/hello2")
  public String hello2() {
    return "Hello Java11";
  }


}
