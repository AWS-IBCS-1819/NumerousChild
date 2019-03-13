import java.util.*;
import java.io.*;

public class Correct{

  ArrayList<String> questions;
  ArrayList<Integer> sheet;

  public Correct(){

    questions = new ArrayList<String>();
    sheet = new ArrayList<Integer>();
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

    int j = 0;
    for(int i=0; i<13; i++){
      questions.get(i);
      j=i;
      sheet.add(j);
    }

  }

  public void setQuest(ArrayList<String> quests){
    questions = quests;
  }

  public void setSheet(ArrayList<Integer> cheat){
    sheet = cheat;
  }

  public ArrayList getQuest(){
    return questions;
  }

  public ArrayList getSheet(){
    return sheet;
  }

  /*public static void main(String[] args) {
    Correct c = new Correct();

    System.out.println(c.questions);
    System.out.println(c.sheet);
  }*/


}
/*
linked list
or create class with answer key to compare buttons w/ answers
*/




/*
Basically what I want to do is if a certain question is being displayed, then only
*these* answers are correct. If it's correct, then it moves to the next question.
Otherwise it just keeps doing what the ActionListener is already doing in TRINGO.

*these answers --> how can I do this more efficiently, without just doing a bunch of if statements for each one.
for each question I can do "if __ button is clicked, correct" "else__ nothing changes in action listener"
*/
