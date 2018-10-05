//homework                due 10/05/18
//2 methods to convert a stringbuilder into the reverse
  //method 1: use a while loop
  //method 2: use recursive

import java.io.*;
import java.util.*;

public class Reverse{

  public static String recursive(String w){ //recursive
    if(w.length() <= 1){//if the word is 0 or no letters
      return w;//then just return the word again
    }
    else{
      return recursive(w.substring(1)) + w.charAt(0);//go through the word but save the first letter to the end.
      //this recursive method is taking the first chunk (substring) of the word and leaving the last letter to start the new string
    }
  }


  public static void main(String[] args) {
    System.out.println("Type the word you would like to reverse.");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

//loop
    for (int i = word.length() - 1; i >= 0;i--){//starting at the last letter and moving to the start of the word...
      System.out.print(word.charAt(i));//print each last letter consecutively
    }
    System.out.print("\n");

//for recursive
    String reverse = recursive(word);
    System.out.println(reverse);
    //System.out.println("the reverse  of " + word + " is " + reverse + ".");

  }


}
