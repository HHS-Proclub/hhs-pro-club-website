import java.util.Scanner;

public class PRB7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();	
	    int[] numbers = new int[size];
	    for(int i = 0; i < size; i++){
	    	numbers[i] = sc.nextInt();
	    }
	    int find = sc.nextInt();
	    double count = 0.0;
	    for(int i = 0; i < size; i++){
	    	if(numbers[i] == find){
	    		count++;
	    	}
	    }
	    System.out.println( (int) ((count/size) * 100));
	}
	
}
