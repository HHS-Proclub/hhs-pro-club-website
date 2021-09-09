import java.util.Scanner;

public class R1A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Scanner magic = new Scanner(System.in);
		String temp = magic.nextLine();
		String[] array = temp.split(" ");
		int[] arr = new int[array.length];
		for(int i = 0; i < array.length; i++){
			arr[i] = Integer.parseInt(array[i]);
		}
		int first = -1;
		int pos;
		int[] ones = new int[arr.length];
		int marker = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 1){
				ones[marker] = i;
				marker++;
			}
		}
		ones[marker] = -15;
		int distance = ones[marker-1];
		for(int i = 0; ones[i+k-1] != -15; i++){
			//System.out.println(ones[i+k-1]);
			//System.out.println(ones[i]);
			//System.out.println(ones[i+k-1]-ones[i]);
			if(ones[i+k-1]-ones[i]<distance){
				distance = ones[i+k-1]-ones[i] + 1;
			}
		}
		System.out.println(distance);
		
	}

}
