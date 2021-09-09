import java.util.Scanner;


public class PRB3 {
	
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int max = 0;
		int x = Integer.parseInt(kb.nextLine());
		for (int i = 0; i<x; i++){
			int y=Integer.parseInt(kb.nextLine());
			if(y>max){
				max = y;
			}
		}
		
		
			
		System.out.println(max);
		
		
		
	}
	
	
	
	

}
