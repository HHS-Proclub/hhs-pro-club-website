import java.util.Scanner;

public class PRB2 {
	Scanner k = new Scanner (System.in);
	private int lowerBound;
	private int upperBound;
	
	public PRB2(){
		lowerBound = k.nextInt();
		upperBound = k.nextInt();
		if (lowerBound<=0){
			lowerBound = 1;
		}

	}
	public static void main(String[] args){
		PRB2 avg = new PRB2();
		double solution = avg.averageCalc();
		System.out.println(solution);
	}
	
	public double averageCalc(){
		double sum = 0;
		int counter = 0;
		while (lowerBound<upperBound){
			sum = sum + lowerBound;
			counter++;
			lowerBound++;
		}
		sum = sum/counter;
		return sum;
	}
}
