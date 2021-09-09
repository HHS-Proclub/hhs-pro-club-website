import java.util.Scanner;
public class PRB3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int Array[] = new int[a];
		int counter = 0;
		while(counter < a){
			Array[counter] = scan.nextInt();
			counter++;
		}
		for(int arrayV = 0; arrayV < a; arrayV++){
			for(int y = Array[arrayV]; y > 0; y--){
				int answer = Array[arrayV]/y;
				int pass = Array[arrayV] % y;
		
			if(pass <= 0){
					System.out.println(answer);
						}
					}

				}

	}
}
