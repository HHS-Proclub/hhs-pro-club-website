import java.util.Scanner;

public class PRA3 {
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		int[] n = new int[x];
		int out=0;
		for(int i = 0; i<x; i++){
			n[i] = kb.nextInt();
		}
		
		for(int i = 1; i<=x; i++){
			int a1 = 0;
			int a2 = 0;
			for(int o = 0; o<i; o++){
				a1+=n[o];
				
			}
			for(int o = i; o<=x; o++){
				a2+=n[o-1]; 
				
			}
			if(a1==a2){
				out = i-1;
				break;
			}
		}
		System.out.println(out);
		
		
	}
	
	
	
	

}
