import java.util.Scanner;


public class PRB6 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int n = kboard.nextInt();
		int[][] bob = new int[n][n];
//		int[][] amy	= new int[n][n];
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				bob[j][n-1-i]=kboard.nextInt();
			}
		}
		
		String fluffy="";
		
		for (int i=0; i<n; i++){
			for (int j=0; j<n-1; j++){
				fluffy= fluffy + bob[i][j] + " ";
			}
			fluffy+=bob[i][n-1];
			fluffy+="\n";
		}
		
		System.out.print(fluffy);
//		for (int i=0; i<n; i++){
//			for (int j=0;
//		}
	//System.out.print("jack and jill went up a hill \nto fetch a pail of water \njack fell down);

	}

}
