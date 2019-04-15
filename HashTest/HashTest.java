import java.util.*;
import java.io.*;

public class HashTest{

  public static void main(String[] args) {
    System.out.println("Type a number no more than 5 digits");
    Scanner scan = new Scanner(System.in);
    String in = scan.nextLine();
//==============================================================================
    //to separate each digit:
/*    if(in<10){
      int a = in;
      System.out.println(a);
    }
    if(in>=10){
      int b = in/10;
      System.out.println(b);
      int r = in%10;
      if(r<10){
        System.out.print(" "+ r);
      }

      if(in>=100){
        int c = in/100;
        System.out.print(" " + c);
        int s = in%100;
        if(s<100){
          System.out.print(" "+ r);
        }

        if(in>=1000){
          int d = in/1000;
          System.out.print(" " + d);
          int t = in%1000;
          if(t<1000){
            System.out.print(" "+ r);
          }

          if(in>=10000){
            int e = in/10000;
            System.out.print(" " + e);
            int u = in%10000;
            if(u<10000){
              System.out.print(" "+ r);
            }
          }
        }
      }
    }*/
/*none of the above is working. I need to start with the bigger numbers and
then divide the remainder by the smaller numbers (ex: divide in/10000 and then
the remainder by 1000 etc.)
However, I don't have enough time to try and separate each digit so I am just
going to treat the integer as a String so I can use charAt.

==============================================================================*/

    for(int i = 0; i<in.length(); i++){
      String lol = in.charAt(i);//it says that char cannot be converted to String...

      while(i<3){
        if(lol.equals("0")){
          System.out.print("82");
        }
        else if(lol.equals("1")){
          System.out.print("37");
        }
        else if(lol.equals("2")){
          System.out.print("7");
        }
        else if(lol.equals("3")){
          System.out.print("4000");
        }
        else if(lol.equals("4")){
          System.out.print("01");
        }
        else if(lol.equals("5")){
          System.out.print("050");
        }
        else if(lol.equals("6")){
          System.out.print("113");
        }
        else if(lol.equals("7")){
          System.out.print("6641");
        }
        else if(lol.equals("8")){
          System.out.print("307");
        }
        /*else if(lol.equals("9")){
          System.out.print("00004");
        }Commenting out this so that if there is a nine in the biggest digits it just won't be included.*/
      }

      while(i>2){
        if(lol.equals("0")){
          System.out.print("28");
        }
        else if(lol.equals("1")){
          System.out.print("02");
        }
        else if(lol.equals("2")){
          System.out.print("703");
        }
        else if(lol.equals("3")){
          System.out.print("89");
        }
        else if(lol.equals("4")){
          System.out.print("22");
        }
        else if(lol.equals("5")){
          System.out.print("00");
        }
        /*else if(lol.equals("6")){
          System.out.print("7865");
        }*/
        else if(lol.equals("7")){
          System.out.print("70");
        }
        else if(lol.equals("8")){
          System.out.print("09");
        }
        else if(lol.equals("9")){
          System.out.print("2928");
        }
      }

    }


    }
  }
