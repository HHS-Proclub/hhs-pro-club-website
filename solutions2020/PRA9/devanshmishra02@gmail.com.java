import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		
		
		
		for(int i = 0; i < n; i++){
			int count = 0;
			int[] arr = new int[9];
			String string = s.nextLine();
			Scanner scan = new Scanner(string);
			
			while(scan.hasNextInt()){
				int x = scan.nextInt();
				
				
				arr[x%7] = 1;
				
				
			}
			for(int f = 0; f <= 8; f++){
				int y = arr[f];
				if( y > 0){
					count++;
					
				}
			}
			
			System.out.println(count);
		}

	}

}
