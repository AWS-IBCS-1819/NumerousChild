//---------MR.C WRK-----------
import java.util.*;

public class Deck {

  ArrayList<Card> cards;//array for cards; OUR MAIN DECK
  ArrayList<Card> discard;//second array for cards; A LIST OF WHAT IS GIVEN OUT
  //Card.java is an object Card

  public Card drawCard() {//new method from Mr.C
    Card c = cards.get(0);//takes a card from first array and removes it from list, then adds it to second array
    cards.remove(0);//REMOVE CARD FROM DECK (LIKE DRAWING A CARD FROM DECK)
    discard.add(c);//COUNTS AS ONE WE GAVE OUT
    return c;//THE METHOD RETURNS A CARD
  }

  public void reset() {//new method from Mr.C; ADDS EVERYTHING IN DISCARD BACK INTO THE MAIN DECK
    cards.addAll(discard);//brings all cards from discard and adds them back to cards then deletes everything in discard
    discard.clear();
  }

  public void shuffle() {//new method from Mr.C; shuffle method is now in Deck.java (before we had it in PokerHand.java)
    Random r = new Random();//creates Random object
    ArrayList<Card> shuffled = new ArrayList<Card>();//creates new ArrayList for shuffled cards

    int[] ar = r.ints(608200, 0, 52).distinct().toArray();
    for (int i = 0; i < 52; i ++) {
      shuffled.add(cards.get(ar[i]));
    }
    cards = shuffled;
  }

  public Deck() {
    cards = new ArrayList<Card>();
    discard = new ArrayList<Card>();

    for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
        }
        else {
          suit = "Spades";
        }
        Card c = new Card();//we create a new card for each time we loop so we can set all 52 cards to an integer value
        c.setName(num + " of " + suit);
        c.setValue(i);
        cards.add(c);
      }
    }

  }

}



//---------MY OLD WRK-----------
/*import java.util.*;

public class Deck {

  ArrayList<String> cards;

  public Deck() {
/*    cards = new ArrayList<String>();
    int count = 1;
    String name = " ";
    for (int i = 0; i < 10; i++) {
      cards.add(count + " of Diamonds");
      cards.add(count + " of Clubs");
      cards.add(count + " of Hearts");
      cards.add(count + " of Spades");
      count++;
    }
    for (int i = 0; i < 3; i++) {
      if (i == 0) {
        name = "Jack";
      } else if (i == 1) {
        name = "Queen";
      } else if (i == 2) {
        name = "King";
      }
      cards.add(name + " of Diamonds");
      cards.add(name + " of Clubs");
      cards.add(name + " of Hearts");
      cards.add(name + " of Spades");
    }*/
    /*cards = new ArrayList<String>();

    for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
      }
      else {
        suit = "Spades";
      }
      Card c = new Card();
      c.setName(num + " of " + suit);
      c.setValue(i);
      cards.add(c);
    }
  }
}

}
*/
