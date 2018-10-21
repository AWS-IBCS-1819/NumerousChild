import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;
  //need to shuffle cards and reset them.

  public Blackjack(){
    d = new Deck();
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();
  }

  /*public ArrayList<String> giveHand(ArrayList<Card> hand){//I think this needs to be a while loop
    ArrayList<String> given = new ArrayList<String>();
    hand.add(d.drawCard());
    for(int j = 0; j <= hand.size(); j++){
      hand.get(j).getName();
      given = hand.get(j).getName();//error = string can't be converted to ArrayList<String> (getName is the string from Card.java)
    }
    return given;
    //System.out.print(userHand);
  }
DON'T NEED THIS METHOD. JUST ADD TWO CARDS TO USERHAND AND COMPHAND SEPARATELY IN MAIN
*/
  public Integer calculateHand(ArrayList<Card> handList){
    int total = 0;
    for(int i = 0; i <= handList.size(); i++){
      handList.get(i).getValue();
      total = total + handList.get(i).getValue();
    }
    return total;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();//don't forget blackjack object
    b.d.reset();
    b.d.shuffle();

    System.out.println("Welcome to Blackjack.");

    for (int i = 0; i <2; i++){
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }
    System.out.println("Your hand: \n" + b.userHand); //print out cards dealt
    System.out.println("Value: \n" + b.calculateHand(b.userHand));//print integer value from calculateHand method

    for (int n = 0; n <2; n++){
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }
    System.out.println("Your opponent is showing a " + b.userHand);

    /*if (b.d.calculateHand(b.compHand) <= 16){
      b.d.drawCard(b.userHand);
    }
    else{
      System.out.println(b.compHand);//print compHand
    }*/
/*
    System.out.println("What would you like to do? \n1. Hit\n2. Stay\n3. Quit");
    Scanner input = new Scanner(System.in);
    String choice = input.next();
    if(choice == "1"){
      //draw a new card, present value.
    }
    else if (choice == "2"){
      //do what the user needs to do
    }
    else{
      break;
    }
*/

  }

}
