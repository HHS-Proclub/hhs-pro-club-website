import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
	Scanner kboard = new Scanner(System.in);
	System.out.println();
	String hexnumber = kboard.next();
	int number1 = Integer.parseInt(hexnumber, 16);
	System.out.println();
	String hexnumber1 = kboard.next();
	int number2 = Integer.parseInt(hexnumber1, 16);
	int n = findGCD(number1, number2);
    String hex = Integer.toHexString(n);
    System.out.println(n);
    System.out.format("%04x", n);
	
	
	}
	private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

}
