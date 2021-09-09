import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args){
		int fin = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5 ; i ++){
			int x = scan.nextInt();
			fin = fin + x;
			
		}
		System.out.println(fin);
	}

}
