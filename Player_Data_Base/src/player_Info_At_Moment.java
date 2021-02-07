//Contains information of player at one moment in time
public class player_Info_At_Moment {
	
	
	private final int ranking;
	private final int age;
	private final String date;
	protected final double date_Formula;
	
	public player_Info_At_Moment( int ranking,
			int age, String date) 
	{
		
		this.ranking = ranking;
		this.age = age;
		this.date = date;
		this.date_Formula = date_Formula(date);
		
	
	}
	private double date_Formula(String date) {
		double value = 0;
		String temp[];
		temp = date.split(",");
		value = (double) Integer.parseInt(temp[0]) * 10.0 + 
				(double) Integer.parseInt(temp[1]) + 
				(double) Integer.parseInt(temp[2])/100.0;
		return value;
		
	}
}