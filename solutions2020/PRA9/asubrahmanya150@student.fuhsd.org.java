import java.util.Scanner;

public class PRA9 {
	public static boolean check(int[] done, int check){
		boolean result = true;
		for(int i = 0; i < done.length; i++){
			if(done[i] == check){
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int reps = Integer.parseInt(in.nextLine());

		for(int i = 0; i < reps; i++){
			String placeholder = (in.nextLine());
			String[] arr = placeholder.split(" ");
			int[] data = new int[arr.length];
			for(int x = 0; x < data.length; x++){
				data[x] = Integer.parseInt(arr[x]);
			}
			int count = 0;
			int[] repeated = new int[arr.length];
			for(int k = 0; k < arr.length; k++){
				repeated[k] = -1;
			}
			for(int m = 0; m < data.length; m++){
				if(check(repeated,(data[m])%7) == true){
					repeated[m] = data[count]%7;
					count++;
				}
				
			}
			
			System.out.println(count);
			
		}
		
	}

}
