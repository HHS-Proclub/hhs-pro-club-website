import java.util.Scanner;
public class PRB1 {
	public static void main(String[] args) {
		
		Scanner scanObject = new Scanner(System.in);

	//	int testcase = 0;
		int count = 0;
		int b = 0;
		
		int testcases = scanObject.nextInt();
		int answers[] = new int [testcases];
		for(int j = 0; j < testcases; j++) {
			int r = scanObject.nextInt();
			int f= r;
			while(count <= b) {
				b = r - count;
				r = b;
				count ++;
				
				//System.out.println(r);
			
				
			}
			//System.out.println(count-1);
			answers[j] = count-1;
			count = 0;
			b = 0;
			r = 0;
			
		}
		
		for(int q = 0; q < testcases; q++) {
			System.out.println(answers[q]);
		}

		
		
			
	}
	

}
