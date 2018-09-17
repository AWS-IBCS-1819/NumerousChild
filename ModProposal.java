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

        //count++; //this says everytime we move on for each loop, add one to count. basically to count every while loop
      }
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }

    System.out.println(myStr);

    //go to string builder api and check out index to see what you can do with this text file
    int num = 0;
    for (int i = 0; i < myStr.capacity() - 4; i++){
      if (myStr.substring(i, i + 4).equals("baby")){
        num++;
      }
      else if (myStr.substring(i, i + 4).equals("END END")){
        break;
      }
    }
    System.out.println("Baby is mentioned " + Integer.toString(num) + " times in A Modest Proposal.");

//still an error but class ended
  }


}
