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

    for (int i = 0; i <2; i++){//adds 2 cards to userHand
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }
    System.out.println("Your hand: \n" + b.userHand + "\nValue: \n" + b.calculateHand(b.userHand)); //print out cards dealt and integer value from calculateHand method

    for (int n = 0; n <2; n++){//adds 2 cards to compHand
      Card c = b.d.drawCard();
      b.userHand.add(c);
    }
    System.out.println("Your opponent is showing a " + b.userHand);

    System.out.println("What would you like to do? \n1. Hit\n2. Stay\n3. Quit");
    Scanner input = new Scanner(System.in);
    String choice = input.next();
    if(choice == "1"){
      b.d.drawCard(b.userHand);
      System.out.println("Your hand: \n" + b.userHand + "\nYour value:\n" + b.calculateHand(b.userHand));
    }
    else if (choice == "2"){
      //do what the user needs to do
      if (b.d.calculateHand(b.compHand) <= 16){
        b.d.drawCard(b.userHand);
      }
      else{
        System.out.println(b.compHand);//print compHand
      }
    }
    else{
      break;
    }

//if statement for compHand stuff
    if (b.d.calculateHand(b.compHand) <= 16){
      b.d.drawCard(b.userHand);
    }
    else{
      System.out.println(b.compHand);//print compHand
    }

  }

}
