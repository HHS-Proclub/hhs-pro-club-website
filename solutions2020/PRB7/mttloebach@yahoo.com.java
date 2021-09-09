import java.util.Scanner;
public class PRB7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("87\n");
		
		int int1 = scan.nextInt();
		int[] array2 = new int[int1];
		scan.nextLine();
		
		String arraysource = scan.nextLine();
		
		
		String[] parts = arraysource.split(" ");
		//System.out.println(parts[0]);
		for(int cycle = 0; cycle < int1; cycle++){
			array2[cycle] = Integer.parseInt(parts[cycle]);
		}
		
		int picknumber = scan.nextInt();
		int counter = 0;
		
		for(int cycle2 = 0; cycle2 < int1; cycle2++){
			if(array2[cycle2] == picknumber){
				counter++;
			}
		}
		
		int answer = (counter*100)/int1;
		System.out.println(answer);

	}

}
