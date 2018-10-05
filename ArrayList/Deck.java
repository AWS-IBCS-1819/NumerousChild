import java.util.*;

public class Deck {

  ArrayList<String> card;

  public Deck(){
    card = new ArrayList<String>();
    //card.add("this deck");
  /*  String a == "Ace";
    a = 1;
    String b == "2";
    b = 2;
    String c == "3";
    c = 3;
    String d == "4";
    d = 4;
    String e == "5";
    e = 5;
    String f == "6";
    f = 6;
    String g == "7";
    g = 8;
    String h == "8";
    h = 8;
    String i == "9";
    i = 9;
    String n == "10";
    n = 10;
    String j == "Diamonds";
    String k == "Clubs";
    String l == "Hearts";
    String m == "Spades";

    for(int z = 0; z<52; z++){
      card.add()
    }*/

    for (int i = 1; i < 14; i++){
      String num = Integer.toString(i);
      card.add(num + " of Diamonds");
    }
    for (int j = 14; j < 27; j++){
      String num = Integer.toString(j);
      card.add(num + " of Clubs");
    }
    for(int k = 27; k < 40; k++){
      String num = Integer.toString(k);
      card.add(num + " of Hearts");
    }
    for(int l = 40; l < 53; l++){
      String num = Integer.toString(l);
      card.add(num + " of Spades");
    }


    /*
    for (int a = 0; a < 39; a+14){
      card.add("Ace");
    }
    for (int b = 1; b< 40; b+14){
      card.add("2");
    }
    for (int a = 2; a < 41; a+14){
      card.add("3");
    }
    for (int b = 3; b< 42; b+14){
      card.add("4");
    }
    for (int a = 4; a < 43; a+14){
      card.add("5");
    }
    for (int b = 5; b< 45; b+14){
      card.add("6");
    }
    for (int a = 6; a < 46; a+14){
      card.add("7");
    }
    for (int b = 7; b< 47; b+14){
      card.add("8");
    }
    for (int a = 8; a < 48; a+14){
      card.add("9");
    }
    for (int b = 9; b< 49; b+14){
      card.add("10");
    }
    for (int a = 10; a < 50; a+14){
      card.add("Jack");
    }
    for (int b = 11; b< 51; b+14){
      card.add("Queen");
    }
    for (int a = 12; a < 52; a+14){
      card.add("King");
    }*/




  }

}
