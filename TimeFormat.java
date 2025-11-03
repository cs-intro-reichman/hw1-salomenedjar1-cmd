// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String PeriodOfDay;

	if (hours >= 12)
		{
		PeriodOfDay= "PM";
		if (hours>12)
		hours= hours-12;
	    }
	else
		PeriodOfDay= "PM";
		

		if (minutes>10)
		System.out.println(hours+ ":" + minutes +" "+PeriodOfDay);

		else 
		System.out.println(hours+ ":0"+ minutes +" "+PeriodOfDay);
	
}
}