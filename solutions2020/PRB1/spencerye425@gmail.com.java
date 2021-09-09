import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class PRB1 {
	
	int statements;
	
	
	public PRB1() {
		
	}
	
	
	public int printAnswers(int numOne, int numTwo) {

		int product = (numOne * numTwo);
		
		return product;
			
	}  


public static void main(String[] args) 
{
	int numQuestions;
	int numQuestionsCopy;
	Scanner scanner = new Scanner(System.in);
	PRB1 panel = new PRB1();
	List<Integer> outputs = new ArrayList<Integer>(); 
	
	numQuestions = scanner.nextInt();
	numQuestionsCopy = numQuestions;

	for (; numQuestions > 0;) {
		int numOne = scanner.nextInt();
		int numTwo = scanner.nextInt();
		outputs.add(panel.printAnswers(numOne, numTwo));
		numQuestions = numQuestions - 1;
	}
	
	numQuestions = numQuestionsCopy;
	
	for (; numQuestionsCopy > 0;) {
		int listElement = Math.abs(numQuestionsCopy - numQuestions);
		System.out.println((outputs.get(listElement)));
		numQuestionsCopy = numQuestionsCopy - 1;
	}
	scanner.close();
	
}
}