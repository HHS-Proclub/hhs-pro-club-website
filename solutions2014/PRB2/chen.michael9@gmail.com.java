import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class PRB2 {
	public static void main(String[] args) throws ParseException
	{
		Scanner kboard = new Scanner(System.in);
		String str = kboard.next();
		SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yyyy");
		Date dt1=format1.parse(str);
		DateFormat format2=new SimpleDateFormat("EEEE"); 
		String finalDay=format2.format(dt1);
		System.out.println(finalDay);
	}
}
