//create a function Fibonacci(n) that returns the nth Fibonacci
//THIS HAS NO ERRORS BUT RETURNS WRONG ANSWER
public class Fibonacci{

  public static int Fibonacci(int n){
    if(n == 1){
      return 1;
    }
    else if (n == 2){
      return 1;
    }
    else{
      return n-1 + Fibonacci(n-2);
    }
  }

  public static void main(String[] args) {
    int place = 4;
    int value = Fibonacci(place);
    System.out.println(value);
  }
}
