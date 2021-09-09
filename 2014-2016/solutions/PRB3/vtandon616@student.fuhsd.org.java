import java.util.Scanner;

public class PRB3 {
	public static void main (String [] args){
	Scanner scanner = new Scanner(System.in);
	int index = scanner.nextInt();
	int sum = 0;
	for(int n = 0; n < index; n++){
		sum += scanner.nextInt();
	}
	System.out.println(sum);
}
}