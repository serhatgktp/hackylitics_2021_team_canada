import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//contains player data at all moments in time
public class  player_Total_Info {
	
	protected static ArrayList<player_Info_At_Moment> player = new ArrayList();
	private  String firstName;
	private  String lastName;
	private  String nationality;
	private double potential_Formula;
	
	public player_Total_Info(String firstName, String lastName, String nationality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		
	}
	public void add_Info(int ranking, int age, String date) {
		player_Info_At_Moment data = new player_Info_At_Moment(ranking, age, date);
		player.add(data);
		Collections.sort(player, (o1, o2) ->  (int)(o2.date_Formula*100 - 
				(int)(o1.date_Formula*100)));
				
	}
	

}
