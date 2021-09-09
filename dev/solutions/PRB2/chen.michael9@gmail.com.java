import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.lang.Math;

public class PRB2 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		String date = kboard.next();
		int year = Integer.parseInt(date.substring(6, 10));
		int month = Integer.parseInt(date.substring(3, 5));
		int day = Integer.parseInt(date.substring(0, 2));
		
		String dayOfTheWeek = "";
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		int i = calendar.get(Calendar.DAY_OF_WEEK);

		    if(i == 3){
		        dayOfTheWeek = "Monday";           
		    } else if (i==4){
		        dayOfTheWeek = "Tuesday";
		    } else if (i==5){
		        dayOfTheWeek = "Wednesday";
		    } else if (i==6){
		        dayOfTheWeek = "Thursday";
		    } else if (i==7){
		        dayOfTheWeek = "Friday";
		    } else if (i==1){
		        dayOfTheWeek = "Saturday";
		    } else if (i==2){
		        dayOfTheWeek = "Sunday";
		    }
		    
		System.out.println(dayOfTheWeek);
	}

}
