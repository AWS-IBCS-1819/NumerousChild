import java.util.*;

public class Correct{
  String a = new String("π/2");
  String c = "√3/2";
  String d = "π/3";
  String e = "0";
  String f = "√2/2";
  String g = "1/2";
  String h = "π/6";
  String i = "π/4";
  String j = "1";
  String k = "√2/3";
  String l = "√3";
  String m = "2";
  String n = "2√3/3";
  ArrayList questions = new ArrayList(String);
  questions.add(a);//b3
  questions.add(c);//b6, b13
  questions.add(d);//b19
  questions.add(e);//b4, b5, b12
  questions.add(f);//b10, b17
  questions.add(g);//b, b19
  answes.add(h);//b16
  questions.add(i);//b7
  questions.add(j);//b8, b11, b20
  questions.add(k);//b2
  questions.add(l);//b14
  questions.add(m);//b15
  questions.add(n);//b18
  String display;

  /*public Check(){
    for(int z=0; z<13; z++){
      display = questions.get(z);
      return display;
    }
  }*/

  public static void main(String[] args) {
    System.out.println(questions);
  }


}

/*
Basically what I want to do is if a certain question is being displayed, then only
*these* answers are correct. If it's correct, then it moves to the next question.
Otherwise it just keeps doing what the ActionListener is already doing in TRINGO.

*these answers --> how can I do this more efficiently, without just doing a bunch of if statements for each one.
for each question I can do "if __ button is clicked, correct" "else__ nothing changes in action listener"
*/
