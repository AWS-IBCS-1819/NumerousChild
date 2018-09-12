// AboutMe.java project by Anna Salam
// partner = Rashida Francis

import java.util.*;

public class AboutMe{

  public static String color; //as in favorite color      This could change
  public static String hand; //as in right/left handed
  public static String subject; //as in favorite subject
  public static String interest; //Things you find interesting but others may not    This could change so it's mutable
  public static String birthplace; //as in where you were born
  public static String siblings; //how many siblings you have <--this could be an integer but it's easier to keep things consistent
  public static String time; //as in are you a night or day person? <--this could be a boolean but it's easier to keep things consistent

  public AboutMe() {
    color = "blue";
    hand = "right handed";
    subject = "history";
    interest = "reading";
    birthplace = "Jamaica";
    siblings = "2";
    time = "night";

  }

  public static void main(String[] args) {

    AboutMe rara = new AboutMe(); //calls constructer method

    System.out.println("This is About Rashida"); //a little greeting
    System.out.println("Choose what you would like to know about Rashida... \n1. favorite color \n2. dominant hand \n3. favorite subject \n4. interests \n5. birth place \n6. number of siblings \n7. prime time");
    Scanner input = new Scanner(System.in);

    String userIn = input.next();
    if(userIn.equals("1")){
      System.out.println("a. Wednesday through Monday \nb. Tuesdays");
      Scanner colorInp = new Scanner(System.in); //scanner for mutable variable
      String colorIn = colorInp.next();
      if(colorIn.equals("a")){
        System.out.println(color);
      }
      else if(colorIn.equals("b")){
        System.out.println("GREEN for green ties");
      }
    }
    if(userIn.equals("2")){
      System.out.println("Rashida is " + hand);
    }
    if(userIn.equals("3")){
      System.out.println("Rashida's favorite subject is " + subject);
    }
    if(userIn.equals("4")){
      System.out.println("a. 4am-12am \n b. 12am-2am");
      Scanner blah = new Scanner(System.in); //scanner for mutable variable
      String interIn = blah.next();
      if(interIn.equals("a")){
        System.out.println(interest);
      }
      else if(interIn.equals("b")){
        System.out.println("playing Wii Sports");
      }
    }
    if(userIn.equals("5")){
      System.out.println("Rashida was born in " + birthplace);
    }
    if(userIn.equals("6")){
      System.out.println("Rashida has " + siblings + " siblings");
    }
    if(userIn.equals("7")){
      System.out.println("Rashida is a " + time + " person");
    }

  }



}
