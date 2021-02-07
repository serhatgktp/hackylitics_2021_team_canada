import java.util.ArrayList;


//contains player data at all moments in time
public class  player_Total_Info {
	
	private static ArrayList<player_Info_At_Moment> player;
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
	    player.sort((h1, h2) -> h1.date_Formula.compare(h2.date_Formula));

		
	}
	

}
