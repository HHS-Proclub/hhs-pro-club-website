import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number2 = s.nextInt();
		for(int a =1; a <= number2; a++){
			int number = s.nextInt();
			for(int i = 1; i <= number; i++){
				if(number % i==0){
					System.out.println(i);	
					}
			}
		}
		
			
		

		

		
	} 

}
