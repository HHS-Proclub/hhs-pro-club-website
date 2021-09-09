import java.util.Scanner;
public class PRB16 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str1 = s.nextLine();
		for(int i = 0; i < n; i++){
			int[] arr = new int[1000];
			int count = 0;
			String str = s.nextLine();
			Scanner scan = new Scanner(str);
			while(scan.hasNextInt()){
				int x = scan.nextInt();
				arr[x] += 1;
				count++;
			}
			
			int best = 0;
			for(int j = 0; j < 1000; j++){
				if(arr[j]>best){
					best = arr[j];
				}
			}
			if(best > (count+1)/2){
				System.out.println("impossible");
			} else {
				System.out.println("possible");
			}
		}
		
	}
}
