package demo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello World from OSAKA";
  }

  @GetMapping(path = "/hello2")
  public String hello2() {
    return "Hello conflict";
  }

}
