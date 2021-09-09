import java.util.*;
public class PRB5 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int list = input.nextInt();
		int max = 0;
		for(int i = 0; i< list; i++){
			int tempmax = input.nextInt();
			if(tempmax>max) max=tempmax;
		}
		System.out.println(max);
	}
}
