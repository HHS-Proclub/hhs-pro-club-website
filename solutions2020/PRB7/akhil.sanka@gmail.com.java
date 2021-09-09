import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] vals = new int[num];
		for(int i = 0; i< num; i++){
			int l1 = in.nextInt();			
			vals[i] = l1;
		}
		int probN =  in.nextInt();
		int count = 0;
		for(int i = 0; i< num; i++){
			if(vals[i] == probN){
				count ++;
			}
		}
		
		System.out.println( count/num);
		
		
		
		
	}

	
}
