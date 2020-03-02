package demo.helloworld.controller;

import demo.helloworld.service.MessageService;
import demo.helloworld.type.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final MessageService messageService;

  public HelloController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello World from OSAKA";
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
    return messageService.getMessage();
  }
}
