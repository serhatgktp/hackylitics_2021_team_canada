package interpreter;
import java.util.ArrayList;
public class Player {
  
  private String name="";
  private String nationality="";
  private ArrayList<Integer> points;
  private ArrayList<Integer> years;
  private int ptsIncrease=0;
  
  public Player(String title)
      //, String nation, ArrayList<Integer> points, ArrayList<Integer> years
      {
    this.name=title;
//    this.nationality=nation;
//    this.points=new ArrayList<Integer>();
//    this.years=new ArrayList<Integer>();
  }
  
  public void addYear(int year) {
    years.add(year);
  }

  public void addPoints(int points) {
    this.points.add(points);
  }

  public String getName() {
    return name;
  }
  
  public String getNationality() {
    return nationality;
  }
  
  public void setName(String title) {
    name=title;
  }
  
  public void setNationality(String title) {
    nationality=title;
  }
  
  public ArrayList<Integer> getYears(){
    return years;
  }
  
  public ArrayList<Integer> getPoints(){
    return points;
  }

  public int getPtsIncrease() {
    return ptsIncrease;
  };
  
  public void setPtsIncrease(int num) {
    ptsIncrease = num;
  }
}
