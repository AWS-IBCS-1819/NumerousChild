
import java.util.*;
import java.io.*;

public class Gradebook{
/*
  public void readFile(String filename) {


    StringBuilder myStr = new StringBuilder();
      try {
        File randtxt = new File("grades.txt");
        Scanner sc = new Scanner(randtxt);
        while (sc.hasNext()){
          myStr.append(sc.nextLine() + "\n");
        }
    }
      catch (FileNotFoundException e){
          e.printStackTrace();
              }

      System.out.println(myStr);

  }

  public void findMean(String mean){//finds average of grades

  }

  public void findSpread(String spread){//finds number of As/Bs/Cs/Ds/Fs

  }

  public void highestGrade(String highest){
    System.out.println("Directly comparing grades does good to no one except the person with the highest grade. It is one of many parts of the flawed educational system.");
  }

  public void lowestGrade(String lowest){
    System.out.println("Directly comparing grades does good to no one except the person with the highest grade. It is one of many parts of the flawed educational system.");
  }

  public void roster(String roseter){//finds name of all students

  }

  public void subjectTeacher(String filename){//finds name of subject and Teacher

    String line1 = null;

    try {
      File randtxt = new File("grades.txt");
      Scanner sc = new Scanner(randtxt);
      while (sc.hasNext()){
        line1 = sc.nextLine();
      }
  }
    catch (FileNotFoundException e){
        e.printStackTrace();
            }
    System.out.println(line1);

  }*/


  public static void main(String[] args) {

    Gradebook gb = new Gradebook();

    StringBuilder myStr = new StringBuilder();
      try {
        File randtxt = new File("grades.txt");
        Scanner sc = new Scanner(randtxt);

        /*myStr.append(sc.next());//code for printing out subject
        myStr.append(sc.next());
        myStr.append(sc.next());
        myStr.append(sc.next());*/
        myStr.append(sc.nextLine());
        System.out.println(myStr);

        while (sc.hasNext()){
          myStr.append(sc.nextLine() + "\n");
        }
    }
      catch (FileNotFoundException e){
          e.printStackTrace();
              }

      //System.out.println(myStr);

}

 /*public static void main(String[] args) {

   Gradebook gb = new Gradebook();
   gb.readFile("grades.txt");

   System.out.println("Choose which you would like to see: \n1. Mean Grades \n2. Grade Spread \n3. Highest Grade \n4. Lowest Grade \n5. Class Subject and Teacher \n6. Student Roster");

   Scanner scan = new Scanner(Syemtem.in);
   String scan = scan.next();
   if(scan.equals("1")){//mean of grades
     gb.findMean("grades.txt");
   }
   if(scan.equals("2")){
     gb.findSpread("grades.txt");
   }
   if(scan.equals("3")){
     gb.highestGrade("grades.txt");
   }
   if(scan.equals("4")){
     gb.lowestGrade("grades.txt");
   }
   if(scan.equals("5")){
     gb.subjectTeacher("grades.txt");
   }
   if(scan.equals("6")){
     gb.roster("grades.txt");
   }
   else{
     System.out.println("Sorry. We don't understand that request.");
   }


 }*/

}
