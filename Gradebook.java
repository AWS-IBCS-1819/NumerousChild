import java.util.*;
import java.io.*;

public class Gradebook{

  ArrayList<Double[]> list = new ArrayList<>();

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
      System.out.println("Unable to open file " + filenName + " .");
    }
    catch(IOException ex){
      System.out.println("Error reading file " + fileName + " .");
    }
  }

  public double convertInt(String s){

  }

  public static void main(String[] args) {

  }


}
