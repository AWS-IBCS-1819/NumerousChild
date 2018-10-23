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

  public String cardNames(ArrayList<Card> haha){
    String cName = " ";
    for (int i = 0; i <= haha.size(); i++ ){
      haha.get(i).getName();
      cName = cName + ", " + haha.get(i).getName();
    }
    return cName;
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
    System.out.println("Your hand:\n" + b.userHand + "\nValue: \n" + b.calculateHand(b.userHand)); //print out cards dealt and integer value from calculateHand method

    for (int n = 0; n <2; n++){//adds 2 cards to compHand
      Card c = b.d.drawCard();
      b.compHand.add(c);
    }
    System.out.println("Your opponent is showing a " + b.compHand.get(1));

    Boolean runProgram = true;
    Scanner input = new Scanner(System.in);

    while(runProgram){
    String choice = input.next();
    System.out.println("What would you like to do? \n1. Hit\n2. Stay\n3. Quit");
    if(choice == "1"){
      b.d.drawCard(b.userHand);
      System.out.println("Your hand: \n" + b.cardNames(b.userHand) + "\nYour value:\n" + b.calculateHand(b.userHand));


    }

    else if (choice == "2"){//if we stay, dealer logic starts
      //do what the comp needs to do
      System.out.println("Dealer's hand:\n" + b.cardNames(b.compHand.get(1)) + "\nValue:" + b.calculateHand(b.compHand.get(1)));
      if (b.calculateHand(b.compHand) <= 16){
        b.d.drawCard(b.userHand);
      }
      else{
        System.out.println("Dealer's hand:\n" + b.compHand + "\nValue:" + b.calculateHand(b.compHand));//print compHand
        if(b.calculateHand(b.compHand) > 21){
          System.out.println("Bust!\nYou win!");
          break;//should go to "do you want to play again?"
        }
        else if(b.calculateHand(b.compHand) < b.calculateHand(b.userHand)){
          System.out.println("You win!");
          break;//should go to "do you want to play again?"
        }
        else{
          System.out.println("You lose.");
          break;//should go to "do you want to play again?"
        }
      }
    }

    else{
      break;
      }
  }


  }

}
