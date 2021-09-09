import java.util.Scanner;
public class PRB5 {

	public static void main(String[] args) {
		Scanner intscan = new Scanner(System.in);
		Scanner lnscan = new Scanner(System.in);
		
		String Input1 = lnscan.nextLine();
		String[] Array1 = Input1.split(" ");
		
		String Input2 = lnscan.nextLine();
		String[] Array2 = Input2.split(" ");
		int ArrayA[] = new int[Array1.length];
		int ArrayB[] = new int[Array2.length];

		for(int cycle = 0; cycle < (Array1.length); cycle++){
			ArrayA[cycle]= Integer.parseInt(Array1[cycle]);
		}
		for(int cycle2 = 0; cycle2 < (Array2.length); cycle2++){
			ArrayB[cycle2] = Integer.parseInt(Array2[cycle2]);
		}
		
		int newest = 0;
		int newestB = 0;
		int majorA = 0;
		int majorB = 0;
		for(int tenfinder = 0; tenfinder < ArrayA.length; tenfinder++){
			if(ArrayA[tenfinder] % 10 == 0){
				newest = ArrayA[tenfinder];
			}
			if(newest > majorA){
				majorA = newest;
			}
			
		
		}
		for(int tenfinderB = 0; tenfinderB < ArrayB.length; tenfinderB++){
			if(ArrayB[tenfinderB] % 10 == 0){
				newestB = ArrayB[tenfinderB];
			}
			if(newestB > majorB){
				majorB = newestB;
			}
		}
		
		System.out.println((majorA+majorB));
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
