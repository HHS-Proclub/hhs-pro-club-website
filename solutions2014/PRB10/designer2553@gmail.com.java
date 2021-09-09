import java.util.*;

public class PRB10 {
	private int number;
	private boolean isDivisibleBy5;
	private boolean isDivisibleBy3;
	
	public PRB10 (int integer) {
		this.number = integer;
		isDivisibleBy5 = number % 5 == 0;
		isDivisibleBy3 = number % 3 == 0;
	}
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		PRB10 obj = new PRB10(kboard.nextInt());
		obj.fizzBuzz();
		kboard.close();
	}
	
	public void fizzBuzz() {
		if (isDivisibleBy5 && isDivisibleBy3) {
			System.out.println("fizzbuzz");
		} else if (isDivisibleBy5) {
			System.out.println("buzz");
		} else if (isDivisibleBy3) {
			System.out.println("fizz");
		} else {
			System.out.println(number);
		}
	}

}
