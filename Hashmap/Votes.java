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

//MR C WORK
      while(thevote.hasNext()){
        String temp = thevote.next();
        if(temp == null){
          break;
        }
        else{
          if(m.containsKey(temp)){
            m.replace(temp, m.get(temp) + 1);
          }
          else{
            m.put(temp, 1);
          }
        }
      }

      System.out.println(m);
    }

    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
//END OF MR C WORK

  }
}
