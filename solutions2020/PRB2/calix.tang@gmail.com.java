import java.util.Scanner;
public class PRB2 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		int[] ans = new int[times];
		//long[] people = new long	[times];
		for(int i = 0; i < times; i++) {
			int rooms = sc.nextInt();
			String Rooms = "";
			boolean needsWork = false;
			for(int j = 0; j < rooms; j++){
				Rooms+=sc.nextInt();
			{
			Rooms += sc.nextInt();
			if(Rooms.contains("101") || Rooms.contains("111")) {
				needsWork = true;
			}
			if(!needsWork) {
				ans[i] = 0;
			}
			for(int j = 0; j < Rooms.length()-3;j++) {
				if(!Rooms.substring(j, j+4).contains("0")) {
					ans[i]++;
				}
			}
		}
		
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		
		sc.close();
	*/
		
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int ans[] = new int[times];
		for(int i = 0; i < times; i++) {
			int rooms = sc.nextInt();
			int zeros = 0;
			int ones = 0;
			for(int  j = 0; j < rooms; j++) {
				if(sc.nextInt()==0) {
					zeros+=1;
				}else {
					ones+=1;
				}
			}
			if(ones>=(double)rooms/2) {
				ans[i]=ones-zeros;
			}else {
				ans[i]=0;
			}
		}
		for(int i = 0; i < times; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}

}
