/*
ID: rikumiyao
LANG: JAVA
TASK: PRB2
*/
import java.io.*;
import java.awt.*;
import java.util.*;
import java.math.*;

public class PRB2 {
	private static String[]days= new String[]{
		"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"
	};
	public static void main(String[]args)throws IOException{
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(),"//");
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		Calendar c = new GregorianCalendar(y,m-1,d);
//		System.out.println(c);
		System.out.println(days[c.get(Calendar.DAY_OF_WEEK)-Calendar.SUNDAY]);
	}
}
