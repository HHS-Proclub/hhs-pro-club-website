import java.util.Scanner;
public class PRA1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Row1[] = new int[3];
		int Row2[] = new int[3];
		int Row3[] = new int[3];
		int Row4[] = new int[3];
		int Row5[] = new int[3];
		
		boolean r1 = true;
		boolean r2 = true;
		boolean r3 = true;
		boolean r4 = true;
		boolean r5 = true;
		
		///take the values here
		String values1 = scan.nextLine();
		String[] parts1 = values1.split(" ");
		Row1[0] = Integer.parseInt(parts1[0]);
		Row1[1] = Integer.parseInt(parts1[1]);
		Row1[2] = Integer.parseInt(parts1[2]);
		
		String values2 = scan.nextLine();
		String[] parts2 = values2.split(" ");
		Row2[0] = Integer.parseInt(parts2[0]);
		Row2[1] = Integer.parseInt(parts2[1]);
		Row2[2] = Integer.parseInt(parts2[2]);
		
		String values3 = scan.nextLine();
		String[] parts3 = values3.split(" ");
		Row3[0] = Integer.parseInt(parts3[0]);
		Row3[1] = Integer.parseInt(parts3[1]);
		Row3[2] = Integer.parseInt(parts3[2]);
		
		String values4 = scan.nextLine();
		String[] parts4 = values4.split(" ");
		Row4[0] = Integer.parseInt(parts4[0]);
		Row4[1] = Integer.parseInt(parts4[1]);
		Row4[2] = Integer.parseInt(parts4[2]);
		
		String values5 = scan.nextLine();
		String[] parts5 = values5.split(" ");
		Row5[0] = Integer.parseInt(parts5[0]);
		Row5[1] = Integer.parseInt(parts5[1]);
		Row5[2] = Integer.parseInt(parts5[2]);
		
		int total1 = Row1[0] + Row1[1]*5;
		int total2 = Row2[0] + Row2[1]*5;
		int total3 = Row3[0] + Row3[1]*5;
		int total4 = Row4[0] + Row4[1]*5;
		int total5 = Row5[0] + Row5[1]*5;
		
	
		if(total1 > Row1[2]){
			r1 = false;
		}
		if(total2 > Row2[2]){
			r2 = false;
		}
		if(total3 > Row3[2]){
			r3 = false;
		}
		if(total4 > Row4[2]){
			r4 = false;
		}
		if(total5 > Row5[2]){
			r5 = false;
		}
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	}
	

}
