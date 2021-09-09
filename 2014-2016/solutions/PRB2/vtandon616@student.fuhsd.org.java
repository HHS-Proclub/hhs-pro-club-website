import java.util.Scanner;

public class PRB2 {
	public static void main (String [] args){
	Scanner scanner = new Scanner(System.in);
	double beforeDiv = 0;
	int numPos = 0;
	
	int lBound = scanner.nextInt();
	int uBound = scanner.nextInt();
	for(int n = lBound; n < uBound; n++){
		if(n > 0){
		beforeDiv += n;
		numPos++;
		}
	}
	System.out.println(beforeDiv/numPos);
	}
}