//Contains information of player at one moment in time
public class player_Info_At_Moment {
	
	
	private final int ranking;
	private final int age;
	private final String date;
	private final double date_Formula;
	
	public player_Info_At_Moment( int ranking,
			int age, String date) 
	{
		
		this.ranking = ranking;
		this.age = age;
		this.date = date;
		this.date_Formula = date_Formula(date);
		
	
	}
	private double date_Formula(String date) {
		double value;
		String temp[];
		temp = date.split(",");
		for(int i = 0;i<3;i++) 
		{
			value+= 
		}		
		
	}
}