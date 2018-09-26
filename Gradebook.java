
import java.util.*;
import java.io.*;

public class Gradebook{

  public static void main(String[] args) {

    Gradebook gb = new Gradebook();

    StringBuilder myStr = new StringBuilder();
      try {
        File randtxt = new File("grades.txt");
        Scanner sc = new Scanner(randtxt);

      /*  System.out.println("Choose which you would like to see: \n1. Mean Grades \n2. Grade Spread \n3. Highest Grade \n4. Lowest Grade \n5. Class Subject and Teacher \n6. Student Roster");

        Scanner scan = new Scanner(Syemtem.in);
        String scan = scan.next();

        if(scan.equals("1")){//mean of grades

        }
        if(scan.equals("2")){//number of a's, b's, etc

        }
        if(scan.equals("3")){//highest grade

        }
        if(scan.equals("4")){//lowest grade

        }
        if(scan.equals("5")){//code for printing out subject and teacher
        */
          myStr.append(sc.nextLine());
          System.out.println(myStr);/*
        }
        if(scan.equals("6")){//roster*/
          myStr.append(sc.)
        /*}
        else{
          System.out.println("Sorry. We don't understand that request.");
        }
*/
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
