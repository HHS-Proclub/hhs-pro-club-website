import java.util.Scanner;

public class HPI2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		boolean[] arr = new boolean[a];
		int count = 0;
		for(int i = 0; i < a; i++){
			arr[i] = false;
		}
		for(int i =1; i < a; i++){
			for(int j = 0; j < a; j++){
				if((j+1)%(i+1) == 0){
					arr[j] = !arr[j];
				}
			}
		}
		for(int i = 0; i < a; i++){
			if(!arr[i]){
				count++;
			}
		}
		System.out.println(count);
	}

}
