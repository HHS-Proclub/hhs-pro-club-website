import java.util.Scanner;
public class PRB6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Array[] = new int[5];
		Array[0] = scan.nextInt();
		Array[1] = scan.nextInt();
		Array[2] = scan.nextInt();
		Array[3] = scan.nextInt();
		Array[4] = scan.nextInt();
		int answer;
		
		if(Array[0] == Array[1] + Array[2] + Array[3] + Array[4]){
			answer = Array[0];
		}else if(Array[1] == Array[0] + Array[2] + Array[3] + Array[4]){
			answer = Array[1];
		}else if(Array[2] == Array[0] + Array[1] + Array[3] + Array[4]){
			answer = Array[2];
		}else if(Array[3] == Array[0] + Array[1] + Array[2] + Array[4]){
			answer = Array[3];
		}else if(Array[4] == Array[1] + Array[2] + Array[3] + Array[0]){
			answer = Array[4];
		}else{
			answer = Array[0] + Array[1] + Array[2] + Array[3] + Array[4];
		}
		
		System.out.println(answer);

	}

}
