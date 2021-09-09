import java.util.Scanner;

public class PRB6 {
	private static int[] list = new int[5];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i ++){
			list[i] = sc.nextInt();
		}
		
		for(int i = 0; i < list.length; i++){
			int current = list[i];
			list[i] = 0;
			if(current == sumOfRest() ){
				System.out.println(current);
				break;
			} 
			list[i] = current;
		}
	}
	public static int sumOfRest(){
		int sum = 0;
		for(int i = 0; i < list.length; i++){
			sum += list[i];
		}
		return sum;
	}
}
