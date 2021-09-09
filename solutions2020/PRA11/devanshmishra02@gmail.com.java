import java.util.Scanner;

public class PRA11 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			String scan1 = s.nextLine();
			Scanner s1 = new Scanner(scan1);
			int[] arr = new int[1000000];
			int[] arr2 = new int[1000000];
			int best = 0;
			int test = 0;
			int test2 = 0;
			int best2 = 1000000;
			int res = 0;
			int count = 0;
			while(s1.hasNextInt()){
				int x = s1.nextInt();
				
				arr[x-1] +=1;
				arr2[x-1] = count;
				count++;
			}
			
			for(int j = 0; j< 1000000; j++){
				test = arr[j];
				test2 = arr2[j];
				if(test > best){
					best = test;
					best2 = test2;
					res = j;
				} else if(test == best && test2 < best2){
					best = test;
					best2 = test2;
					res = j;
				} else {
					
				}
			}
			System.out.println(res+1);
		}
	}
}
