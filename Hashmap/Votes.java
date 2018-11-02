/*create hashmap for their key=name and value=# of votes from the text file.
use containsKey method and replace(key, old value, new value) and get(key)
            m.replace(Annie, m.get(Annie), m.get(Annie)+1)
*/

import java.util.*;
import java.io.*;

public class Votes{

  public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<String, Integer>();
    try {
      File poll = new File("thevote.txt");
      Scanner thevote = new Scanner(poll);


      while(thevote.hasNext()){
        String x = thevote.next();
        int v = 0;
        //m.put(x, v);

        if(thevote.next().equals(x)){
          v = v + 1;
          m.put(x, v);
        }
        System.out.println(m);
      }
    }

    catch (FileNotFoundException e) {
      e.printStackTrace();
    }



    //if next line = jake/annie/... then add one to their thing
  }
}
