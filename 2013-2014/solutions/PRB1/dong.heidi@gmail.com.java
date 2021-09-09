import java.util.Scanner;

public class PRB1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfThrows = input.nextInt(); 
		int total = 0;
		for(int i=1;i<=numberOfThrows;i++){
			total+=input.nextInt();
		}
		System.out.println(total/numberOfThrows);
	}

}
