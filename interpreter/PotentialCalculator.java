package interpreter;

import java.util.ArrayList;

public class PotentialCalculator extends PotentialList{
  
  public void determineStars(ArrayList<Player> playerData) {
    
    int i=0;
    while(i<playerData.size() & playerData.get(i).getPoints().size()>1) {   //Checks that there are >1 entries
      if(playerData.get(i).getYears().get(0)>playerData.get(i).getYears().get(1)) { //Checks for ascending or descending order. I will add an alignment mechanism after the hackathon.
        playerData.get(i).setPtsIncrease(playerData.get(i).getPoints().get(0) - 
            playerData.get(i).getPoints().get(1));
      }
      else {
        playerData.get(i).setPtsIncrease(playerData.get(i).getPoints().get(1) - 
            playerData.get(i).getPoints().get(0));
      }
      i++;
    }                               
    
  }
  
}
