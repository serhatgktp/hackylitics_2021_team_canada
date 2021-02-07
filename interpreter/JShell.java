package interpreter;

import java.util.ArrayList;

public class JShell {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    CSVReader List1 = new CSVReader();
    
    List1.importCSV("Sample_Rankings_2021.csv");
    PotentialList potentials = new PotentialList();
    potentials.addAllPlayers(List1.getPlayerList());

    potentials.determineImprovement();  // Determines how players have improved within the given
                                        // time span
    potentials.populateStarList();      // Populates an empty list with potential big-ballers
    potentials.printStarList();         // Print the list of players that are expected to make it
                                        // big! This is the end product!

    }
    
    
  }
