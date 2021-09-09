import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args){
		Scanner h = new Scanner(System.in);
		int n = h.nextInt();
		int a = h.nextInt();
		if(n <0){
			n = 1;
		}
		int count = 0;
		int sum = 0;
		for(int i = n; i< a; i++){
			count += 1;
			sum += i;
			continue;
		}
		double avg = sum*1.0/count;
		System.out.println(avg);
	}
}
