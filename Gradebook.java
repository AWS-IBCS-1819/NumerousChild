import java.util.*;
import java.io.*;

public class Gradebook{

  /*public void readFile(fileName){

    StringBuilder mysb = new StringBuilder();

    try {
      File gradetxt = new File(fileName);
      Scanner sc = new Scanner(gradetxt);

      while (sc.hasNext()){

        mysb.append(sc.nextLine() + "\n");
      }


      for (int i = 0; i < mysb.length(); i = i + 1){
        if (mysb.substring(i).equals("%")){
          codePointCount(int i-4, int i){//can't work because it needs to be its own method
            Double.parseDouble(i);
          }
        }
      }


    }

    catch (FileNotFoundException e){
      e.printStackTrace();
    }

  }

  public int indexOf(String str){

  }*/

/*  ArrayList<Double[]> list = new ArrayList<>();

  public void readFile(String filename){
    try{
      FileReader fr = new FileReader(filename);
      Bufferedreader bufferedReader = new bufferedReader(fileReader); //BufferedReader goes through a file and checks all the chars/lines/arrays

      while(line = bufferedReader.readLine() != null) {
        line.convertInt();
      }
      bufferedReader.close();

    }
    catch(FileNotFoundException ex){
      ex.printStackTrace();
    }
    catch(IOException ex){
      System.out.println("Error reading file " + fileName + " .");
    }
  }

  public double convertInt(String s){

  }*/

  public static void main(String[] args) {
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

    /*StringBuilder mysb = new StringBuilder();
    try {
      File gradetxt = new File(fileName);
      Scanner sc = new Scanner(gradetxt);
      while (sc.hasNext()){
        mysb.append(sc.nextLine() + "\n");
      }
      for (int i = 0; i < mysb.length(); i = i + 1){
        if (mysb.substring(i).equals("%")){
          codePointCount(int i-4, int i){//can't work because it needs to be its own method
            Double.parseDouble(i);
          }
        }
      }
    }
    catch (FileNotFoundException e){
      e.printStackTrace();
    }

    System.out.println("Choose which you would like to see: \n1. Mean Grades \n2. Grade Spread \n3. Highest Grade \n4. Lowest Grade \n5. Class Subject and Teacher \n6. Student Roster");
    Scanner scan = new Scanner(Syemtem.in);
    String scan = scan.next();
    if(scan.equals("1")){//mean of grades

    }
    if(scan.equals("2")){

    }
    if(scan.equals("3")){

    }
    if(scan.equals("4")){

    }
    if(scan.equals("5")){

    }
    if(scan.equals("6")){

    }
    else{
      System.out.println("Sorry. We don't understand that request.");
    }*/
  }

//method for converting string to double
//Double.parseDouble("the number you want to convert");

}
