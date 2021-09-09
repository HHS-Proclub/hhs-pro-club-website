import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		int sum = 0;
		int max = 0;
		for(int i = 0; i< 5; i++){
			int l1 = in.nextInt();
			sum += l1;
			if (l1 > max){
				max = l1;
			}
		}
		
		if(sum - max == max){
			System.out.println(max);
		}
		else{
			System.out.println(sum - max);
		}
		
		
		
		
	}

}
