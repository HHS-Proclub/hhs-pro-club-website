//package R3;

import java.util.Scanner;

public class R3B1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = Double.valueOf(in.nextLine())*10;
		double y1 = Double.valueOf(in.nextLine())*10;
		double x2 = Double.valueOf(in.nextLine())*10;
		double y2 = Double.valueOf(in.nextLine())*10;
		if (x1==x2){
			System.out.println("na");
		} else{
			long val = Math.round(((y1-y2)/(x1-x2))*1000);
			String dec = (Long.toString(Math.abs((val%1000))));
			String full = (Long.toString(Math.round(val/1000)));
			System.out.println(full + "." + dec);
		}
	}
}
