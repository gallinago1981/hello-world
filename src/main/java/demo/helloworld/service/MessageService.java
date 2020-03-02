package demo.helloworld.service;

import demo.helloworld.type.MessageType;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class MessageService {

  public String getMessage() {
    long now = LocalDate.now().toEpochDay();
    int index = BigDecimal.valueOf(now).remainder(BigDecimal.valueOf(MessageType.values().length)).intValue();
    return MessageType.values()[index].getMessage();
  }
}
