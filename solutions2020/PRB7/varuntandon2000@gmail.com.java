import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numInputs = s.nextInt();
		int[] inputs = new int[numInputs];
		for(int i = 0; i < numInputs; i++)
			inputs[i] = s.nextInt();
		int desired = s.nextInt();
		int numInside = 0;
		for(int i = 0; i < inputs.length; i++){
			if(inputs[i] == desired)
				numInside++;
		}
		System.out.println(numInside*100/numInputs);
	}

}
