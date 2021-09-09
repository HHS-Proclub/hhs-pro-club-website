import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int step = Integer.parseInt(kb.nextLine());
		int step2 = step/2;
		int distance = Integer.parseInt(kb.nextLine());
		
		int total = 0;
		int distanceCovered = 0;
		while(distanceCovered < distance) {
			if(total % 2 == 0) {
				distanceCovered += step;
			} else {
				distanceCovered += step2;
			}
			total++;
		}
		
		System.out.println(total);
	}
}
