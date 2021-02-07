package interpreter;

import java.util.ArrayList;

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
  
  public void determineImprovement() {
    
    int i=0;
    while(i<allPlayers.size()) {   //Checks that there are >1 entries
      if(allPlayers.get(i).getPoints().size()>1) {  //Make sure there is enough info to compare
          if(allPlayers.get(i).getYears().get(0)>allPlayers.get(i).getYears().get(1)) { //Checks for ascending or descending order. I will add an alignment mechanism after the hackathon.
            allPlayers.get(i).setPtsIncrease(allPlayers.get(i).getPoints().get(0) - 
                allPlayers.get(i).getPoints().get(1));
          }
          else {
            allPlayers.get(i).setPtsIncrease(allPlayers.get(i).getPoints().get(1) - 
                allPlayers.get(i).getPoints().get(0));
          }
          i++;
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
