package interpreter;

import java.util.ArrayList;
import java.util.HashMap;

public class PotentialList {
  
  private ArrayList<Player> allPlayers;
  private ArrayList<Player> potentialStars;
  
  public void addPotentialStars(Player player){
    potentialStars.add(player);
  }
  
  public void addAllPlayers(ArrayList<Player> players){
    for(int i=0; i<players.size(); i++) {
      potentialStars.add(players.get(i));
    }
  }
  
  public ArrayList<Player> getAllPlayers(){
    return allPlayers;
  }
  
  public void determineImprovement(HashMap<String, Integer> comparisonMap) {
    
    int i=0;
    while(i<allPlayers.size()) {
      if(comparisonMap.containsKey(allPlayers.get(i).getName())){
        allPlayers.get(i).setPtsIncrease(allPlayers.get(i).getPoints().get(0) - 
            comparisonMap.get(allPlayers.get(i).getName()));
      }
    }
    
  }
  
  public void populateStarList() {
    for(int i=0; i<allPlayers.size(); i++) {
     if(allPlayers.get(i).getPtsIncrease()>300) {
       addPotentialStars(allPlayers.get(i));
     } 
    }
  }
  
  public void printStarList() {
    for(int i=0; i<potentialStars.size(); i++) {
      System.out.println(potentialStars.get(i).getName() +
          " - " + potentialStars.get(i).getNationality());
    }
  }
  
}
