import java.util.Scanner;
public class PRB3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B[] = new int[A];
		int xa = 0;
		while(xa <= (A-1)){
			B[xa] = scan.nextInt();
			xa++;
		}
		/////works///
		
		for(int cycle = 0; cycle <= (A-1); cycle++){
			
			for(int div = B[cycle]; div > 0; div--){
				if(B[cycle] % div == 0){
					int answer = B[cycle]/div;
					System.out.println(answer);
				}
			}
		}
		
	

	}

}
