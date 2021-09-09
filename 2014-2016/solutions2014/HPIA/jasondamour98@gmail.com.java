import java.util.Scanner;


public class HPIA {

	public static void main(String[] args) {
		int test = (new Scanner(System.in)).nextInt();
		int large=-1, small=-1;
		for(int i = 2; i<test; i++){
			if(((double)test/i)%1==0){
				small=i;
				break;
			}
		}
		System.out.println(small);
		for(int i =test-1; i>1; i--){
			if(((double)test/i)%1==0){
				large=i;
				break;
			}
		}
		System.out.println(large);
	}

}
