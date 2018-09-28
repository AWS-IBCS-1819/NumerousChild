//Anna Salam
//9/28/18
//this is a project outlining loop examples from the in-class pseudocode worksheet (problems #2, #3, and #5)

import java.util.*;

public class LoopExamples{

  public static void main(String[] args) {

//loop for #2
    int sum = 0;
    System.out.println("Input a value for y");//requests a y value
    Scanner twoA = new Scanner(System.in);//scans input for a y value since it is meant to be unknown
    int y = twoA.nextInt();
    System.out.println("Input a value for x");
    Scanner twoB = new Scanner(Sytem.in);
    int x = twoB.nextInt();
    for(int i = x; i < y; i++){//i starts at x value; the loop continues until i is less than y; adds 1 to i until then
      sum = sum + i;
    }//for this problem if you meant the sum of all numbers between x and y INCLUDING y then I would do i =< y instead of i < y
    return sum;

//loop for #3
    System.out.println("Input a series of numbers as a string");
    Scanner three = new Scanner(System.in);
    int stringIndex = three.nextInt();
    int number = 0;
    int amountOfnum = 0;
    for(int i = 0; i < stringIndex + 1; i++){//first loop to go through all the numbers in the string
      i = number;
      for(int d = 0; d < stringIndex + 1; d++){//second loop to compare i to each number in the loop. I need something in here to not compare i to i.
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
