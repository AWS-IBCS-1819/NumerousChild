import java.util.*;

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
    cards = new ArrayList<String>();

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
