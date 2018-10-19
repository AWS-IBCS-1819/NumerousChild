import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;
  //need to shuffle cards and reset them.

  public Blackjack(){

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
    b.d.shuffle();

    System.out.println("Welcome to Blackjack.");

    System.out.println("Your hand: \n" + b.giveHand(b.userHand)); //print out cards dealt
    System.out.println("Value: \n" + b.calculateHand(b.userHand));//print integer value from calculateHand method

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
