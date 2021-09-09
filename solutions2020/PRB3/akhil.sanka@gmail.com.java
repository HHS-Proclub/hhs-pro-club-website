import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for(int i = 0; i<x; i++){
			int n = in.nextInt();
			for(int j = 1; j<=n ; j++ ){
				if(n % j == 0){
					System.out.println(j);
				}
			}
		}
		
		
	}

}
