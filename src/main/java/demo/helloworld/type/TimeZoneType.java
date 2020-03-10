package demo.helloworld.type;

public enum TimeZoneType {

  MORNING(1),
  NOON(2),
  EVENING(3);

  int value;
  TimeZoneType(int value) {
    this.value = value;
  }

}