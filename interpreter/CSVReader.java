package interpreter;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;  
 
public class CSVReader {
  
public void scanCSV(String path) {
  Scanner sc = null;
  try {
    sc = new Scanner(new File(path));
  } catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }  
  sc.useDelimiter(",");   //sets the delimiter pattern  
  while (sc.hasNext())  //returns a boolean value  
  {  
  System.out.print(sc.next());  //find and returns the next complete token from this scanner  
  }   
  sc.close();  //closes the scanner  
  }

}
