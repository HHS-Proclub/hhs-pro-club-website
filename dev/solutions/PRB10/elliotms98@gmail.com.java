public class PRB10 {

	public static void main(String args[]) {
		System.out.println(Calculate(5));
	}

	public static String Calculate(int number) {
		if(number % 5 == 0 && number % 3 ==0){
			return "fizzbuzz";
		}else if (number % 3 == 0){
			return "fizz";
		}else if(number % 5 == 0){
			return "buzz";
		}else {
			return number + "";
		}
	}
}
