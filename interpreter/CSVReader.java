package interpreter;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;  
 
public class CSVReader {
  
  private ArrayList<Player> playerList;
  
  public CSVReader() {
    playerList = new ArrayList<Player>();
  }
  
public void printCSV(String path) {
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

public void readCSV(String path) {
  
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
    String name = new String();
    name = sc.next();  //find and returns the next complete token from this scanner  
    Player newPlayer = new Player(name);
    playerList.add(newPlayer);

  }   
  sc.close();  //closes the scanner  

}

  public ArrayList<Player> getPlayerList(){
    return playerList;
  }

}
