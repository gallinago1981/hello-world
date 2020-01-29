package demo.helloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

  @GetMapping("/echo")
  public ResponseEntity<String> echo() {
    return ResponseEntity.ok("OK");
  }

  @GetMapping("/status")
  public ResponseEntity<String> status() {
    return ResponseEntity.ok("running...");
  }

  @GetMapping("/associate")
  public ResponseEntity<String> associate() {
    return ResponseEntity.ok("test{aaaa:1}");
  }

}
