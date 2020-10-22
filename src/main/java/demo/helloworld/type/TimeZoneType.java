package demo.helloworld.type;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Optional;

public enum TimeZoneType {

  MORNING(1, LocalTime.of(6, 0, 0), LocalTime.of(10, 59, 59)),
  NOON(2, LocalTime.of(11, 0, 0), LocalTime.of(14, 59, 59)),
  EVENING(3, LocalTime.of(16, 0, 0), LocalTime.of(18, 59, 59)),
  NIGHT(4, LocalTime.of(19, 0, 0), LocalTime.of(21, 59, 59)),
  MIDNIGHT(5, LocalTime.of(22, 0, 0), LocalTime.of(5, 59, 59));

  int value;
  LocalTime startTime;
  LocalTime endTime;
  TimeZoneType(int value, LocalTime startTime, LocalTime endTime) {
    this.value = value;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public static TimeZoneType getCurrentTimeZone() {
    LocalTime now = LocalDateTime.now().toLocalTime();
    Optional<TimeZoneType> currentTimeZone =
            Arrays.stream(TimeZoneType.values()).filter(t -> now.isAfter(t.startTime) && now.isBefore(t.endTime)).findFirst();
    return currentTimeZone.orElseThrow();
  }

}