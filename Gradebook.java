import java.util.*;
import java.io.*;

public class Gradebook{


  public static void main(String[] args) {

    Gradebook gb = new Gradebook();

    StringBuilder myStr = new StringBuilder();//StringBuilder for class subject and teacher name
    StringBuilder forRos = new StringBuilder();//StringBuilder for class roster
    StringBuilder grades = new StringBuilder();//StringBuilder for all of the grades
    StringBuilder no = new StringBuilder();
    StringBuilder ohno = new StringBuilder();

    int numZ = 0; //number of grades (default setting)
    Double added = 0.0; //sum of all the grades (default setting)
    Double high = 0.0; //highest grade (default setting)
    Double low = 100.0; //lowest grade (default setting)

    int A = 0;//number of A's
    int B = 0;//number of B's
    int C = 0;
    int D = 0;
    int F = 0;

    Double doub =  null;

    for(int i = 0; i < grades.length(); i = i+5){//for loop to translate numbers from grades string into Double
      doub = Double.parseDouble(grades.substring(i, i+4));
      numZ++;
      added = added + doub;
      if (high < doub){//if statement for highest/lowest grades
        high = doub;
      }
      else if (low > doub){
        low = doub;
      }
      else{
        high = high;//if whatever grade is currently being analyzed isn't larger than the highest one, then the highest doesn't change
        low = low;
      }

      if (doub >= 90.0){//if statement for grade spread.
        A++;//add one to the number of A's
      }
      else if (doub >= 80.0){
        B++;//add one to the number of B's
      }
      else if (doub >= 70.0){
        C++;
      }
      else if (doub >= 60.0){
        D++;
      }
      else{
        F++;
      }
    }


  Double average = added / numZ; //average = the sum of all the numbers ÷ number of grades.


      try {
        File randtxt = new File("grades.txt");
        Scanner sc = new Scanner(randtxt);

        myStr.append(sc.nextLine());

        while (sc.hasNext()){
          /*forRos.append(sc.next() + " ");
          forRos.append(sc.next() + " " + "\n");*/
          forRos.append(sc.next() + " ");
          forRos.append(sc.next() + " " + "\n");
          no.append(sc.next());
          ohno.append(sc.next());
        }

        System.out.println("Choose which you would like to see: \n1. Mean Grades \n2. Grade Spread \n3. Highest Grade \n4. Lowest Grade \n5. Class Subject and Teacher \n6. Student Roster");

        Scanner scannerr = new Scanner(System.in);
        String scan = scannerr.next();

        if(scan.equals("1")){//mean of grades
          System.out.println("The mean of all the class grades is " + average);
        }
        if(scan.equals("2")){//number of a's, b's, etc
          System.out.println("The grade spread is... \nA: " + A + "\nB: " + B + "\nC: " + C + "\nF: " + F);
        }
        if(scan.equals("3")){//highest grade
          System.out.println("The highest grade is " + high);
        }
        if(scan.equals("4")){//lowest grade
          System.out.println("The lowest grade is " + low);
        }
        if(scan.equals("5")){//code for printing out subject and teacher

          System.out.println("The name of the class and teacher is ");
          System.out.println(myStr);
        }
        if(scan.equals("6")){//roster

          System.out.println("The student roster is ");
          System.out.println(forRos);
        }
        /*else{
          System.out.println("Sorry. We don't understand that request.");
        }*/

        while (sc.hasNext()){
          myStr.append(sc.nextLine() + "\n");
        }
    }
      catch (FileNotFoundException e){
          e.printStackTrace();
        }

      //System.out.println(myStr);

}


}
