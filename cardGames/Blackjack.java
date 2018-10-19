import java.util.*;

public class Blackjack {

  Deck d = d.Card.shuffle();
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Backjack(){

  }

  public ArrayList<String> giveHand(ArrayList<Card> userHand){//I think this needs to be a while loop
    userHand.add(d.Card.drawCard());
    return hand;
  }

  public Integer calculateHand(){
    
    return user;
    return puter;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();

    System.out.println("Welcome to Blackjack.");

    System.out.println("Your hand: \n" + giveHand()); //print out cards dealt
    System.out.println("Value: \n" + value);//print integer value from calculateHand method

    System.out.println("Your opponent is showing a " + puter);

    System.out.println("What would you like to do? \n1. Hit\n2. Stay\n3. Quit");
    Scanner input = new Scanner(System.in);
    String choice = input.next();
    if(choice == "1"){
      //draw a new card, present value.
    }
    if else (choice == "2"){
      //do what the user needs to do
    }
    else{
      break;
    }


  }

}
