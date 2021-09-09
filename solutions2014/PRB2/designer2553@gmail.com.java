//When given a date, prints out a day.

import java.text.*;
import java.util.*;

public class PRB2 {

	private static String theDate;
	private static String day;
	
	public static void main (String[] args) throws ParseException{
		Scanner kboard = new Scanner(System.in);
		theDate = kboard.next();
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		Date dateInput = format1.parse(theDate);
		DateFormat format2 = new SimpleDateFormat("EEEE");
		day = format2.format(dateInput);
		System.out.println(day);
	}
}
