//Anna Salam
//9/28/18
//this is a project outlining loop examples from the in-class pseudocode worksheet (problems #2, #3, and #5)

import java.util.*;

public class LoopExamples{

  public static void main(String[] args) {

//loop for #2
    int sum = 0;
    System.out.println("Input a value for y");
    Scanner twoA = new Scanner(System.in);
    int y = twoA.nextInt();
    System.out.println("Input a value for x");
    Scanner twoB = new Scanner(Sytem.in);
    int x = twoB.nextInt();
    for(int i = x; i < y; i++){
      sum = sum + i;
    }
    return sum;

//loop for #3
    System.out.println("Input a series of numbers as a string");
    Scanner three = new Scanner(System.in);
    int stringIndex = three.nextInt();
    int number = 0;
    int amountOfnum = 0;
    for(int i = 0; i < stringIndex + 1; i++){
      i = number;
      for(int d = 0; i < stringIndex + 1; d++){
        if(d = i){
          amountOfnum = amountOfnum + 1;
        }
      }
      return amountOfnum;
    }
    return number;


//loop for #5
    System.out.println("Input a value for x");
    Scanner five = new Scanner(System.in);
    int x = five.nextInt();
    int product = 1;
    for(int i = 1; i<=x; i++){
      product = product * i;
    }
    return product;

  }
}
