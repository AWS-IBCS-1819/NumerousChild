import java.util.*;
import java.io.*;

public class Correct{


  //String display;

  /*public Check(){
    for(int z=0; z<13; z++){
      display = questions.get(z);
      return display;
    }
  }*/

  public static void main(String[] args) {
    ArrayList<String> questions = new ArrayList<String>();//an array list of all the questions that will be outputted with their corresponding button/answer commented next to them
    questions.add("π/2");//b3 -0
    questions.add("√3/2");//b6, b13 -1
    questions.add("π/3");//b19 -2
    questions.add("0");//b4, b5, b12 -3
    questions.add("√2/2");//b10, b17 -4
    questions.add("1/2");//b, b9 -5
    questions.add("π/6");//b16 -6
    questions.add("π/4");//b7 -7
    questions.add("1");//b8, b11, b20 -8
    questions.add("√2/3");//b2 -9
    questions.add("√3");//b14 -10
    questions.add("2");//b15 -11
    questions.add("2√3/3");//b18 -12
    System.out.println(questions);

    ArrayList<Integer> sheet = new ArrayList<Integer>();
    int i = 0;
    for(int j=0; j<13; j++){
      questions.get(j);
      i = j;
      sheet.add(i);
    }
    System.out.println(sheet);



  }


}
/*
linked list
or create class with answer key to compare buttons w/ answers*/

/*
Basically what I want to do is if a certain question is being displayed, then only
*these* answers are correct. If it's correct, then it moves to the next question.
Otherwise it just keeps doing what the ActionListener is already doing in TRINGO.

*these answers --> how can I do this more efficiently, without just doing a bunch of if statements for each one.
for each question I can do "if __ button is clicked, correct" "else__ nothing changes in action listener"
*/
