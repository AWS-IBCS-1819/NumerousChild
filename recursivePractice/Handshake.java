//Java program for Handshake Problem
// 10/03/18

public class Handshake {

  public static int Handshake(int n){
    if(n == 2){
      return 1;
    }
    else{
      return n-1 + Handshake(n-1);
    }
  }
  public static void main(String[] args) {

    int numPeeps = 5;//this number would be the changing number. could use scanner input
    int shakes = Handshake(numPeeps);

    System.out.println(shakes);
  }
}
