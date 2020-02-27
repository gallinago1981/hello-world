package demo.helloworld.service;

import static java.time.DayOfWeek.SUNDAY;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.DayOfWeek;

@Service
public class MessageService {

  public String getMessage() {
    DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
    switch(dayOfWeek) {
      case SUNDAY: return "A";
      case MONDAY: return "B";
      case TUESDAY: return "C";
      case WEDNESDAY: return "D";
      default:
        return "Z";
    }
  }
}
