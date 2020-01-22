package demo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World - #2 issue";
    }

    @GetMapping(path = "/hello2")
    public String hello2() {
        return "Hello Java11";
    }
}
