package interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JShell {
  
  public static void initMap(HashMap<String, Integer> map, ArrayList<Player> list) {
    for(int i=0; i<list.size(); i++) {
      map.put(list.get(i).getName(), list.get(i).getPoints().get(0));
    }
    System.out.println("\nMap Initialized!");
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CSVReader List1 = new CSVReader();
    CSVReader List2 = new CSVReader();
    
    List1.importCSV("Sample_Rankings_2021.csv");
    List2.importCSV("Sample_Rankings_2020.csv");
    PotentialList potentials = new PotentialList();
    potentials.addAllPlayers(List1.getPlayerList());
    HashMap<String, Integer> comparisonMap = new HashMap<String, Integer>();
    initMap(comparisonMap, List2.getPlayerList());

    potentials.determineImprovement(comparisonMap);  // Determines how players have improved within the given
                                        // time span
    potentials.populateStarList();      // Populates an empty list with potential big-ballers
    potentials.printStarList();         // Print the list of players that are expected to make it
                                        // big! This is the end product!

    }
    
    
  }
