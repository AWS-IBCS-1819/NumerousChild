//ReadFile.java by Anna Salam
//will read the text file saite A Modest Proposal
// 9/14/18


import java.util.*;
import java.io.*;//useful for reading files

public class ModProposal {

  public static void main(String[] args) {

    StringBuilder myStr = new StringBuilder();

    try {
      File randtxt = new File("aModestProposal.txt");
      Scanner sc = new Scanner(randtxt);

      while (sc.hasNext()){

        myStr.append(sc.nextLine() + "\n");
      }
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }

    System.out.println(myStr);

    //go to string builder api and check out index to see what you can do with this text file
  }
}
