import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack(){

  }

  /*public ArrayList<String> giveHand(ArrayList<Card> userHand){//I think this needs to be a while loop

    userHand.add(d.drawCard());
    return userHand;//userHand is an ArrayList<Card> and thus can't be converted to an ArrayList<String>
  }
*/
  public Integer calculateHand(ArrayList<Card> handList){
    //handList = new ArrayList<Integer>();
    /*for(int i=0; i<=handList.size(); i++){
    if(Card.getValue() == 11){
      handList.add(10);
    }
    else if(Card.getValue() == 12){
      handList.add(10);
    }
    else if(Card.getValue() == 13){
      handList.add(10);
    }
    else if(Card.getValue() == 1){
      handList.add(11);
    }
    else{
      handList.add(Card.getValue());
    }
  }
    int calc = 0;
    for(int i = 1; i<= handList.size(); i++){
      calc = calc + handList.get(i);
      return calc;
    }*/
    int total = 0;
    for(int i = 0; i <= handList.size(); i++){
      handList.get(i).getValue();
      total = total + handList.get(i).getValue();
    }
    return total;
  }

  public static void main(String[] args) {

    Blackjack b = new Blackjack();//don't forget blackjack object

    System.out.println("Welcome to Blackjack.");

    //System.out.println("Your hand: \n" + b.giveHand(b.userHand)); //print out cards dealt
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
