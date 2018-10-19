import java.util.*;

public class Blackjack {

  Deck d;
  Deck b = d.shuffle();
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack(){

  }

  public ArrayList<String> giveHand(ArrayList<Card> userHand){//I think this needs to be a while loop
    while()
    userHand.add(d.drawCard());
    return hand;

    b.userHand.add(b.d.drawCard());
  }

  public Integer calculateHand(ArrayList<Card> handList){
    //handList = new ArrayList<Integer>();
    if(b.Card.getValue() == 11){
      handList.add(10);
    }
    else if(b.Card.getValue() == 12){
      handList.add(10);
    }
    else if(b.Card.getValue() == 13){
      handList.add(10);
    }
    else if(b.Card.getValue() == 1){
      handList.add(11);
    }
    else{
      handList.add(Card.getValue());
    }
    int calc = 0;
    for(int i = 1; i<= handList.size(); i++){
      calc = calc + handList.get(i);
      return calc;
    }
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();

    System.out.println("Welcome to Blackjack.");

    System.out.println("Your hand: \n" + giveHand(userHand)); //print out cards dealt
    System.out.println("Value: \n" + calculateHand(userHand));//print integer value from calculateHand method

    /*System.out.println("Your opponent is showing a " + giveHand(compHand));

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
