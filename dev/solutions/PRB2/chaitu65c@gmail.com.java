import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PRB2 
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in) ;
		String F = kboard.nextLine() ;
		
		int month = Integer.parseInt(F.split("/")[0]);
		int day = Integer.parseInt(F.split("/")[1]);
		int year = Integer.parseInt(F.split("/")[2]);
		
		
		GregorianCalendar calendar = new GregorianCalendar() ; 
		calendar.set(year, month-1, day); 
		int i = calendar.get(calendar.DAY_OF_WEEK);
		
		
		String dayOfTheWeek = "";
		if(i ==  Calendar.MONDAY){
	        dayOfTheWeek = "Monday";           
	    } else if (i== Calendar.TUESDAY){
	        dayOfTheWeek = "Tuesday";
	    } else if (i== Calendar.WEDNESDAY){
	        dayOfTheWeek = "Wednesday";
	    } else if (i== Calendar.THURSDAY){
	        dayOfTheWeek = "Thursday";
	    } else if (i== Calendar.FRIDAY){
	        dayOfTheWeek = "Friday";
	    } else if (i== Calendar.SATURDAY){
	        dayOfTheWeek = "Saturday";
	    } else if (i== Calendar.SUNDAY){
	        dayOfTheWeek = "Sunday";
	    } 
		
		
		System.out.println(dayOfTheWeek);
	}
}


