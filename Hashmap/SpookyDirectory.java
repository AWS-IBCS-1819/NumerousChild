import java.util.*;

public class SpookyDirectory{

  public static void main(String[] args) {
    /*key: costume
      value: scary factor
      */

    Map<String, String> m = new HashMap<String, String>();
    m.put("Ghost", "kinda scary");
    m.put("Zombie Doctor", "fairly scary");
    m.put("Map", "not scary");
    m.put("Nudist on Strike", "very scary");
    m.put("Clown", "too scary");
    m.put("Mike Meyers", "depends on movie");
    m.put("Tom Hanks", "always scary");
    m.put("Maleficent", "good scary");

    System.out.println(m);
  }
}
