import java.util.*;
public class PokerHand{
  Deck d;

/*
Deck is an ArrayList of cards (strings)
52 strings
index values 0-51
inser a card @ specific index
  Goal: create a random index
*/
  public Deck shuffle(Deck d){ //in order to shuffle a Deck you need a Deck
    Random r = new Random(); //<-- this is to create a new object; constructor method; each time we call shuffle we make a new random
    ArrayList<String> shuffled = new ArrayList<String>();

    int[] ar = r.ints(6300, 0, 52).distinct().toArray();//can't just print array
    for (int i = 0; i < ar.length; i ++){//loop is to help print contents of array
      //System.out.println(ar[i]);
      shuffled.add(d.cards.get(ar[i]));
    }
    d.cards = shuffled;
    return d;
  }



//---------MR.C WRK-----------
  public ArrayList<String> giveHand(Deck d) {

      ArrayList<String> hand = new ArrayList<String>(5);
      for (int i = 0; i < 5; i++) {
        hand.add(d.cards.get(i));
      }
      return hand;
    }

    public String evaluate(ArrayList<String> hand) {
      String result = "";
      int numD = 0;
      int numC = 0;
      int numH = 0;
      int numS = 0;

      for (int i = 0; i < 5; i++) {
        if (hand.get(i).contains("Diamonds")) {
          numD++;
        }
        else if (hand.get(i).contains("Clubs")) {
          numC++;
        }
        else if (hand.get(i).contains("Hearts")) {
          numH++;
        }
        else {
          numS++;
        }
      }

      if (numD == 5 || numC == 5 || numH == 5 || numS == 5) {
        result = "FLUSH";
        System.out.println(result);
        System.out.println(hand);
      }
      return result;
    }

    public Pokerhand() {
      d = new Deck();
    }



  public static void main(String[] args) {
    //Deck d = new Deck();
/*
    Random r = new Random(); //<-- this is to create a new object; constructor method
    int[] ar = r.ints(6300, 0, 52).distinct().toArray();//can't just print array
    for (int i = 0; i < ar.length; i ++){//loop is to help print contents of array
      //System.out.println(ar[i]);
      System.out.println(d.cards.get(ar[i]));
    }*/
    //System.out.println("\n" + ar.length);

    //System.out.println(d.cards);



//--------MR.C WRK-----------
    System.out.println("Number of hands dealt: 1");
    Pokerhand p = new Pokerhand();
    //System.out.println(p.d.cards);
    for (int i = 0; i < 1; i++) {
      p.d = p.shuffle(p.d);
      ArrayList<String> h = p.giveHand(p.d);
      System.out.println(h);
      String res = p.evaluate(h);
    }
  }
}
