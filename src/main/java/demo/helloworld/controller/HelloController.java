package demo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/conflict")
  public String conflict() {
    return "Hello Conflict";
  }
}
