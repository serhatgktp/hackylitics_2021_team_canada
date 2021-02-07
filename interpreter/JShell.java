package interpreter;

import java.util.ArrayList;

public class JShell {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CSVReader List = new CSVReader();
    
    List.readCSV("Rankings_2021.csv");
    
    int i=0;
    
    while(i < List.getPlayerList().size()) {
      System.out.println(List.getPlayerList().get(i).getName());
      i++;
    }
    
    
  }

}
