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
    int ace = 0;//ace
    int royal = 0;//jack, king, queen
    int total = 0;
    for(int i = 0; i <= handList.size(); i++){
      if(handList.get(i).getValue() >= 10){
        royal = 10;//assigns jack, queen, and/or king to equal 10
        total = total + royal;//adds J/Q/K to total
      }
      else if (handList.get(i).getValue() == 1){
        ace = 11; //assigns ace to have value of 11
        total = total + ace;//adds ace to total
      }
      else if (handList.get(i).getValue()< 10){
        total = total + handList.get(i).getValue();//adds every other card to total as its orignial value
      }
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

    while(true){//while loop so that user can keep playing game
      Blackjack b = new Blackjack();
      b.d.reset();//resets everything
      b.d.shuffle();//shuffles cards each time
      b.userHand.clear();//clears user and computer hands
      b.compHand.clear();

      System.out.println("Welcome to Blackjack.");

      b.userHand.add(b.d.drawCard());
      b.userHand.add(b.d.drawCard());//user draws 2 cards
      System.out.println("Your hand:\n" + b.cardNames(b.userHand) + "\nValue: \n" + Integer.toString(b.calculateHand(b.userHand))); //print out cards dealt and integer value from calculateHand method

      b.compHand.add(b.d.drawCard());
      b.compHand.add(b.d.drawCard());
      System.out.println("The Dealer's hand:\n" + b.cardNames(b.compHand.get(0)));//displays only the dealers first card

      while(b.calculateHand(b.userHand)<21){//while user isn't over 21
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        System.out.println("What would you like to do? \n1. Hit\n2. Stay\n3. Quit");

        if(choice.equals("1")){//if user hits then add a card to their hand
          b.d.drawCard(b.userHand);
          System.out.println("Your hand: \n" + b.cardNames(b.userHand) + "\nYour value:\n" + Integer.toString(b.calculateHand(b.userHand)));
        }

        else if (choice.equals("2")){//if user stays, then computer stuff needs to happen.
          break;
        }

        else if (choice.equals("3")){
          System.exit(0);//quit program
        }
      }

      while(b.calculateHand(b.compHand)<= 16){//while compHand is less than 16...
        b.compHand.add(b.d.drawCard());
        System.out.println("The Dealer's hand:\n" + b.cardNames(b.compHand) + "\nDealer's value:\n" + Integer.toString(b.calculateHand(b.compHand)));//adds a card to dealer's hand until 16 is reached. Shows all of their cards.
      }

      if (b.calculateHand(b.compHand) == 21){
        System.out.println("The Dealer has a value of " + Integer.toString(b.calculateHand(b.compHand)) + "\nYou lose.");
      }
      else if(b.calculateHand(b.compHand) > 21 && b.calculateHand(b.userHand) <= 21){//if comp is over 21 and user is still under 21 then user wins
        System.out.println("The dealer busts. You WIN!");
      }
      else if(b.calculateHand(b.userHand) == 21){//if user has 21 then they win
        System.out.println("Your total is "+  Integer.toString(b.calculateHand(b.userHand)) + "\nYou WIN!");
      }
      else if(b.calculateHand(b.userHand) > 21 && b.calculateHand(b.compHand) <= 21){//if user is over 21 and comp is less than
        System.out.println("You bust. You LOSE!");
      }
      else if (b.calculateHand(b.userHand) > 21 && b.calculateHand(b.compHand) > 21){//if both are over 21
        System.out.println("Everyone loses!");
      }
      else if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand) && b.calculateHand(b.compHand) < 21 && b.calculateHand(b.userHand) < 21){//if both were less than 21 but the comp was more than user then comp wins
        System.out.println("\nDealer's value:\n" + Integer.toString(b.calculateHand(b.compHand)) + "Dealer wins.");
      }
      else if (b.calculateHand(b.compHand) < b.calculateHand(b.userHand) && b.calculateHand(b.compHand) < 21 && b.calculateHand(b.userHand) < 21){//if both were under 21 but user was more than comp then user wins
        System.out.println("\nDealer's value:\n" + Integer.toString(b.calculateHand(b.compHand)) + "You WIN!");
      }
      else if(b.calculateHand(b.compHand) == b.calculateHand(b.userHand)){//if user and comp had same value then it's a tie
        System.out.println("\nDealer's value:\n" + Integer.toString(b.calculateHand(b.compHand)) + "It's a tie.");
      }

      System.out.println("Would you like to play again?\n1. Yes\n2. No"); //choosing to play again or not
        Scanner input = new Scanner(System.in);
        String choice2 = input.next(); //if chooses yes then the while loop will continue normally. only way to quit here is to select 2
        if (choice2.equals("2")){//if chooses no then break from while loop and end program.
          break;
        }


    }

  }

}
