public class Card {

  Int value;
  String name;

  public void setName(String n) {
    name = n;
  }

  public void setValue(Int v) {
    value = v;
  }

  public String getName() {
    return name;
  }

  public Integer getValue() {
    return value;
  }

  public Card() {
    name = "";
    value = 0;
  }

}
