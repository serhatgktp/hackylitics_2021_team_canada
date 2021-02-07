import java.util.ArrayList;


//contains player data at all moments in time
public class player_Total_Info {
	
	private static ArrayList<player_Info_At_Moment> player;
	private  String firstName;
	private  String lastName;
	private  String nationality;
	
	public player_Total_Info(String firstName, String lastName, String nationality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		
	}
	public void add_Info(player_Info_At_Moment data) {
		player.add(data);
		
	}

}
