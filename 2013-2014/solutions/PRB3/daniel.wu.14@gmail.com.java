
import java.util.Scanner;

public class PRB3 {
	public static void main(String args[]){
		Scanner input1 = new Scanner(System.in);
		int numAt = input1.nextInt();
		int fibb1 = 0;
		int fibb2 = 1;
		int fibb3 = 1;
		int lock = 0;
		numAt--;
		while(lock < 1){
			if(numAt < 0)System.out.println("Error");
			else lock = 2;
		}
		for(int i = 0; i < numAt; i++){
			fibb3 = fibb1 + fibb2;
			fibb1 = fibb2;
			fibb2 = fibb3;
		}
		System.out.println(fibb3);
	}
}