import java.util.Scanner;

public class PRA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int temp = 0; //holds values temporarily
		for(int i = 0; i < n*a; i++){
			int placeholder = (int) Math.ceil((double) i / a);
			if(i-(n-placeholder)*b <=0){
				if(i>temp){
					temp = i;
				}
			}
		}
		System.out.println((int) temp);
	}

}