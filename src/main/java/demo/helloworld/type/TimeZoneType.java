package demo.helloworld.type;

public enum TimeZoneType {

  MORNING(1),
  NOON(2),
  EVENING(3),
  NIGHT(4);

  int value;
  TimeZoneType(int value) {
    this.value = value;
  }

}
